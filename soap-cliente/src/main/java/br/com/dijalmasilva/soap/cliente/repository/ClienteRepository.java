/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.cliente.repository;

import br.com.dijalmasilva.soap.cliente.model.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author dijalmasilva
 */
@Stateless
public class ClienteRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Cliente cliente) {
        em.persist(cliente);
    }

    public Cliente edit(Long id, Cliente cliente) {
        Cliente finded = em.find(Cliente.class, id);
        finded.setCpf(cliente.getCpf());
        finded.setNome(cliente.getNome());
        finded.setRenda(cliente.getRenda());
        Cliente clientEdit = em.merge(finded);
        return clientEdit;
    }

    public Cliente findById(Long id) {
        return em.find(Cliente.class, id);
    }

    public Cliente findByCpf(String cpf) {
        try {
            return em.createQuery("Select c from Cliente c where c.cpf like :cpf", Cliente.class)
                    .setParameter("cpf", cpf)
                    .getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    public Cliente[] findAll() {
        List<Cliente> clientes = em.createQuery("From Cliente c", Cliente.class).getResultList();
        return clientes.toArray(new Cliente[0]);
    }

    public void delete(Long id) {
        Cliente find = em.find(Cliente.class, id);
        em.remove(find);
    }
}
