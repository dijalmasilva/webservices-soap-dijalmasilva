/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.agencia.model;

import br.com.dijalmasilva.soap.cliente.ws.Cliente;
import br.com.dijalmasilva.soap.hotel.ws.Reserva;
import br.com.dijalmasilva.soap.passagem.ws.Passagem;
import java.io.Serializable;

/**
 *
 * @author dijalmasilva
 */
public class PacoteForm implements Serializable {

    private Reserva reserva;
    private Passagem passagem;
    private Cliente cliente;

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
