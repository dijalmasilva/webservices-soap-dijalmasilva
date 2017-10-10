/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.hotel.repository;

import br.com.dijalmasilva.soap.hotel.model.Hotel;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dijalmasilva
 */
@Stateless
public class HotelRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Hotel hotel) {
        em.persist(hotel);
    }

    public Hotel edit(Long id, Hotel hotel) {
        Hotel finded = em.find(Hotel.class, id);
        finded.setCidade(hotel.getCidade());
        finded.setDescricao(hotel.getDescricao());
        finded.setNome(hotel.getNome());
        finded.setRua(hotel.getRua());
        return em.merge(finded);
    }

    public Hotel findById(Long id) {
        return em.find(Hotel.class, id);
    }

    public Hotel[] findAll() {
        List<Hotel> hoteis = em.createQuery("From Hotel h", Hotel.class).getResultList();
        return hoteis.toArray(new Hotel[0]);
    }

    public void delete(Long id) {
        Hotel find = em.find(Hotel.class, id);
        em.remove(find);
    }
}
