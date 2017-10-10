/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.hotel.ws;

import br.com.dijalmasilva.soap.hotel.exceptions.ReservaException;
import br.com.dijalmasilva.soap.hotel.model.Reserva;
import br.com.dijalmasilva.soap.hotel.repository.ReservaRepository;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author dijalmasilva
 */
@WebService
public class ReservaService {

    @EJB
    private ReservaRepository dao;

    public void save(Reserva reserva) throws ReservaException {
        dao.save(reserva);
    }

    public Reserva edit(Long id, Reserva reserva) {
        return dao.edit(id, reserva);
    }

    public Reserva findById(Long id) {
        return dao.findById(id);
    }

    public Reserva[] findAll() {
        return dao.findAll();
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
