/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.agencia.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author dijalmasilva
 */
@Entity
public class Pacote implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private Long idReserva;
    private Long idPassagem;

    public Pacote() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Long getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(Long idPassagem) {
        this.idPassagem = idPassagem;
    }

}
