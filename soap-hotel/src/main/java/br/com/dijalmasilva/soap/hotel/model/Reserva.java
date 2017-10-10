/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.hotel.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dijalmasilva
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Reserva implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String dataReservada;
    private String diaDaCriacaoDaReserva;
    @OneToOne
    private Hotel hotel;
    private String cpfCliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataReservada() {
        return dataReservada;
    }

    public void setDataReservada(String dataReservada) {
        this.dataReservada = dataReservada;
    }

    public String getDiaDaCriacaoDaReserva() {
        return diaDaCriacaoDaReserva;
    }

    public void setDiaDaCriacaoDaReserva(String diaDaCriacaoDaReserva) {
        this.diaDaCriacaoDaReserva = diaDaCriacaoDaReserva;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

}
