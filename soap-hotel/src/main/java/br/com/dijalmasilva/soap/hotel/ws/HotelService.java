/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.hotel.ws;

import br.com.dijalmasilva.soap.hotel.exceptions.ReservaException;
import br.com.dijalmasilva.soap.hotel.model.Hotel;
import br.com.dijalmasilva.soap.hotel.model.Reserva;
import br.com.dijalmasilva.soap.hotel.repository.HotelRepository;
import br.com.dijalmasilva.soap.hotel.repository.ReservaRepository;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author dijalmasilva
 */
@WebService
public class HotelService {

    @EJB
    private HotelRepository dao;
    @EJB
    private ReservaRepository reservaDao;

    public void saveHotel(Hotel hotel) {
        dao.save(hotel);
    }

    public Hotel editHotel(Long id, Hotel hotel) {
        return dao.edit(id, hotel);
    }

    public Hotel findHotelById(Long id) {
        return dao.findById(id);
    }

    public Hotel[] findAllHotel() {
        return dao.findAll();
    }

    public void deleteHotel(Long id) {
        dao.delete(id);
    }

    public Reserva saveReserva(Reserva reserva) throws ReservaException {
        return reservaDao.save(reserva);
    }

    public Reserva editReserva(Long id, Reserva reserva) {
        return reservaDao.edit(id, reserva);
    }

    public void deleteReserva(Long idReserva) {
        reservaDao.delete(idReserva);
    }

    public Reserva[] findAllReserva() {
        return reservaDao.findAll();
    }

    public Reserva findReservaById(Long id) {
        return reservaDao.findById(id);
    }
}
