/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.agencia.repository;

import br.com.dijalmasilva.soap.agencia.model.Pacote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dijalmasilva
 */
@Stateless
public class PacoteRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Pacote pacote) {
        em.persist(pacote);
    }

    public Pacote edit(Long id, Pacote pacote) {
        Pacote find = em.find(Pacote.class, id);
        find.setIdReserva(pacote.getIdReserva());
        find.setIdPassagem(pacote.getIdPassagem());
        return em.merge(find);
    }

    public Pacote findById(Long id) {
        return em.find(Pacote.class, id);
    }

    public Pacote[] findAll() {
        return em.createQuery("From Pacote p", Pacote.class).getResultList().toArray(new Pacote[0]);
    }

    public void delete(Long id) {
        Pacote find = em.find(Pacote.class, id);
        em.remove(find);
    }
}
