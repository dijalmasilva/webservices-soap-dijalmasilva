/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.passagem.repository;

import br.com.dijalmasilva.soap.cliente.ws.Cliente;
import br.com.dijalmasilva.soap.cliente.ws.ClienteService;
import br.com.dijalmasilva.soap.cliente.ws.ClienteServiceService;
import br.com.dijalmasilva.soap.passagem.exceptions.PassagemException;
import br.com.dijalmasilva.soap.passagem.model.Passagem;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dijalmasilva
 */
@Stateless
public class PassagemRepository {

    @PersistenceContext
    private EntityManager em;

    public Passagem save(Passagem passagem) throws PassagemException {
        ClienteServiceService proxy = new ClienteServiceService();
        ClienteService clienteService = proxy.getClienteServicePort();
        Cliente cliente = clienteService.findByCpf(passagem.getCpfCliente());
        if (cliente == null) {
            throw new PassagemException("Usuário não cadastrado!");
        }
        em.persist(passagem);
        return passagem;
    }

    public Passagem edit(Long id, Passagem passagem) {
        Passagem finded = em.find(Passagem.class, id);
        finded.setCidadeDestino(passagem.getCidadeDestino());
        finded.setCidadeOrigem(passagem.getCidadeOrigem());
        finded.setCpfCliente(passagem.getCpfCliente());
        finded.setValorDaPassagem(passagem.getValorDaPassagem());
        return em.merge(finded);
    }

    public Passagem findById(Long id) {
        return em.find(Passagem.class, id);
    }

    public Passagem[] findAll() {
        List<Passagem> passagens = em.createQuery("From Passagem p", Passagem.class).getResultList();
        return passagens.toArray(new Passagem[0]);
    }

    public void delete(Long id) {
        Passagem find = em.find(Passagem.class, id);
        em.remove(find);
    }
}
