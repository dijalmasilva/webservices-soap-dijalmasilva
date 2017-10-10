/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.hotel.controllers;

import br.com.dijalmasilva.soap.hotel.exceptions.ReservaException;
import br.com.dijalmasilva.soap.hotel.model.Hotel;
import br.com.dijalmasilva.soap.hotel.model.Reserva;
import br.com.dijalmasilva.soap.hotel.repository.HotelRepository;
import br.com.dijalmasilva.soap.hotel.repository.ReservaRepository;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
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
public class HotelController implements Serializable {

    @EJB
    private HotelRepository daoHotel;
    @EJB
    private ReservaRepository daoReserva;
    private Hotel hotel;
    private Reserva reserva;
    private Date dateReserva;
    private boolean showNemHotel;
    private boolean showEditHotel;
    private boolean showListHotels;
    private boolean showReserva;

    public HotelController() {
        this.hotel = new Hotel();
        this.reserva = new Reserva();
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Date getDateReserva() {
        return dateReserva;
    }

    public void setDateReserva(Date dateReserva) {
        this.dateReserva = dateReserva;
    }

    public void salvarHotel() {
        daoHotel.save(hotel);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Sucesso!", "Hotel cadastrado!"));
        hotel = new Hotel();
    }

    public void salvarReserva() {
        Instant toInstant = dateReserva.toInstant();
        reserva.setDataReservada(toInstant.atZone(ZoneId.systemDefault()).toLocalDate().toString());
        reserva.setId(0L);
        try {
            daoReserva.save(reserva);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Sucesso!", "Reserva realizada!"));
        } catch (ReservaException ex) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Erro!", ex.getMessage()));
        }
        dateReserva = null;
        setShowListHotels(true);
    }

    public Hotel[] listarHoteis() {
        return daoHotel.findAll();
    }

    public void editHotel() {
        daoHotel.edit(hotel.getId(), hotel);
        hotel = new Hotel();
        setShowListHotels(true);
    }

    public void deletarHotel(Long idHotel) {
        daoHotel.delete(idHotel);
        setShowListHotels(true);
    }

    public void etapaReserva(Hotel hotel) {
        reserva = new Reserva();
        reserva.setDiaDaCriacaoDaReserva(LocalDate.now().toString());
        reserva.setHotel(hotel);
        setShowReserva(true);
    }

    public boolean isShowNemHotel() {
        return showNemHotel;
    }

    public void setShowNemHotel(boolean showNemHotel) {
        setAllFalse();
        this.showNemHotel = showNemHotel;
    }

    public boolean isShowEditHotel() {
        return showEditHotel;
    }

    public void setShowEditHotel(boolean showEditHotel, Hotel hotel) {
        setAllFalse();
        this.hotel = hotel;
        this.showEditHotel = showEditHotel;
    }

    public boolean isShowListHotels() {
        return showListHotels;
    }

    public void setShowListHotels(boolean showListHotels) {
        setAllFalse();
        this.showListHotels = showListHotels;
    }

    public boolean isShowReserva() {
        return showReserva;
    }

    public void setShowReserva(boolean showReserva) {
        setAllFalse();
        this.showReserva = showReserva;
    }

    public LocalDate today() {
        return LocalDate.now();
    }

    private void setAllFalse() {
        this.showEditHotel = false;
        this.showListHotels = false;
        this.showNemHotel = false;
        this.showReserva = false;
    }
}
