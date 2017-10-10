/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.agencia.controllers;

import br.com.dijalmasilva.soap.agencia.model.Pacote;
import br.com.dijalmasilva.soap.agencia.model.PacoteForm;
import br.com.dijalmasilva.soap.agencia.service.PacoteService;
import br.com.dijalmasilva.soap.cliente.ws.Cliente;
import br.com.dijalmasilva.soap.cliente.ws.ClienteService;
import br.com.dijalmasilva.soap.cliente.ws.ClienteServiceService;
import br.com.dijalmasilva.soap.hotel.ws.Hotel;
import br.com.dijalmasilva.soap.hotel.ws.HotelService;
import br.com.dijalmasilva.soap.hotel.ws.HotelServiceService;
import br.com.dijalmasilva.soap.hotel.ws.Reserva;
import br.com.dijalmasilva.soap.hotel.ws.ReservaException_Exception;
import br.com.dijalmasilva.soap.passagem.ws.Exception_Exception;
import br.com.dijalmasilva.soap.passagem.ws.Passagem;
import br.com.dijalmasilva.soap.passagem.ws.PassagemService;
import br.com.dijalmasilva.soap.passagem.ws.PassagemServiceService;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author dijalmasilva
 */
@ManagedBean
@ViewScoped
public class PacoteController implements Serializable {

    @EJB
    private PacoteService pacoteService;
    private Pacote pacote;
    private BigInteger valor;
    private Date dataDaReserva;
    private String cidadeOrigem;
    private String cidadeDestino;
    private String cpfCliente;
    private Hotel hotel;
    private final ClienteService clienteService;
    private final HotelService hotelService;
    private final PassagemService passagemService;

    private boolean showNew;
    private boolean showList;

    public PacoteController() {
        this.pacote = new Pacote();
        ClienteServiceService proxyCliente = new ClienteServiceService();
        HotelServiceService proxyHotel = new HotelServiceService();
        PassagemServiceService proxyPassagem = new PassagemServiceService();
        hotelService = proxyHotel.getHotelServicePort();
        passagemService = proxyPassagem.getPassagemServicePort();
        clienteService = proxyCliente.getClienteServicePort();
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public BigInteger getValor() {
        return valor;
    }

    public void setValor(BigInteger valor) {
        this.valor = valor;
    }

    public Date getDataDaReserva() {
        return dataDaReserva;
    }

    public void setDataDaReserva(Date dataDaReserva) {
        this.dataDaReserva = dataDaReserva;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
        this.cidadeDestino = hotel.getCidade();
    }

    public void salvarPacote() {
        Reserva reserva = new Reserva();
        reserva.setCpfCliente(cpfCliente);
        reserva.setDataReservada(dataDaReserva.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
        reserva.setDiaDaCriacaoDaReserva(LocalDate.now().toString());
        reserva.setHotel(hotel);
        Passagem passagem = new Passagem();
        passagem.setCidadeDestino(cidadeDestino);
        passagem.setCidadeOrigem(cidadeOrigem);
        passagem.setCpfCliente(cpfCliente);
        passagem.setValorDaPassagem(valor);
        try {
            this.pacote = new Pacote();
            Reserva r = hotelService.saveReserva(reserva);
            Passagem p = passagemService.save(passagem);
            pacote.setIdReserva(r.getId());
            pacote.setIdPassagem(p.getId());
            pacoteService.salvar(pacote);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Sucesso!", "Pacote confirmado!"));
            setShowNew(true);
        } catch (ReservaException_Exception | Exception_Exception ex) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Erro!", "Cliente não cadastrado!"));
        }
    }

    public List<PacoteForm> listarPacotes() {
        Pacote[] pacotes = pacoteService.listar();
        List<PacoteForm> pf = new ArrayList<>();
        for (Pacote p : pacotes) {
            Passagem passagem = passagemService.findById(p.getIdPassagem());
            Reserva reserva = hotelService.findReservaById(p.getIdReserva());
            Cliente cliente = clienteService.findByCpf(reserva.getCpfCliente());
            PacoteForm pacForm = new PacoteForm();
            pacForm.setPassagem(passagem);
            pacForm.setReserva(reserva);
            pacForm.setCliente(cliente);
            pf.add(pacForm);
        }

        return pf;
    }

    public List<Hotel> listarHoteis() {
        return hotelService.findAllHotel();
    }

    public boolean isShowNew() {
        return showNew;
    }

    public void setShowNew(boolean showNew) {
        setAllDefault();
        this.showNew = showNew;
    }

    public boolean isShowList() {
        return showList;
    }

    public void setShowList(boolean showList) {
        setAllDefault();
        this.showList = showList;
    }

    private void setAllDefault() {
        this.showList = this.showNew = false;
        this.cidadeDestino = "";
        this.cidadeOrigem = "";
        this.cpfCliente = "";
        this.dataDaReserva = null;
        this.pacote = new Pacote();
        this.hotel = new Hotel();
        this.valor = null;
    }
}
