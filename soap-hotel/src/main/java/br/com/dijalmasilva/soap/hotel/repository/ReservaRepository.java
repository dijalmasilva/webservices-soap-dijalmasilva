/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.hotel.repository;

import br.com.dijalmasilva.soap.cliente.ws.Cliente;
import br.com.dijalmasilva.soap.cliente.ws.ClienteService;
import br.com.dijalmasilva.soap.cliente.ws.ClienteServiceService;
import br.com.dijalmasilva.soap.hotel.exceptions.ReservaException;
import br.com.dijalmasilva.soap.hotel.model.Reserva;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dijalmasilva
 */
@Stateless
public class ReservaRepository {

    @PersistenceContext
    private EntityManager em;

    public Reserva save(Reserva reserva) throws ReservaException {
        ClienteServiceService proxy = new ClienteServiceService();
        ClienteService clienteService = proxy.getClienteServicePort();
        Cliente cliente = clienteService.findByCpf(reserva.getCpfCliente());
        if (cliente == null) {
            throw new ReservaException("Usuário não cadastrado!");
        }
        em.persist(reserva);
        return reserva;
    }

    public Reserva edit(Long id, Reserva reserva) {
        Reserva finded = em.find(Reserva.class, id);
        finded.setCpfCliente(reserva.getCpfCliente());
        finded.setDataReservada(reserva.getDataReservada());
        finded.setHotel(reserva.getHotel());
        finded.setDiaDaCriacaoDaReserva(reserva.getDiaDaCriacaoDaReserva());
        return em.merge(finded);
    }

    public Reserva findById(Long id) {
        return em.find(Reserva.class, id);
    }

    public Reserva[] findAll() {
        List<Reserva> hoteis = em.createQuery("From Reserva r", Reserva.class).getResultList();
        return hoteis.toArray(new Reserva[0]);
    }

    public void delete(Long id) {
        Reserva find = em.find(Reserva.class, id);
        em.remove(find);
    }
}
