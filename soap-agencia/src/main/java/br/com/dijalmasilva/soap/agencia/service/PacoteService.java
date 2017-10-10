/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.agencia.service;

import br.com.dijalmasilva.soap.agencia.model.Pacote;
import br.com.dijalmasilva.soap.agencia.repository.PacoteRepository;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author dijalmasilva
 */
@Stateless
public class PacoteService {

    @EJB
    private PacoteRepository dao;

    public void salvar(Pacote pacote) {
        dao.save(pacote);
    }

    public Pacote edit(Long id, Pacote pacote) {
        return dao.edit(id, pacote);
    }

    public Pacote[] listar() {
        return dao.findAll();
    }

    public Pacote buscarPorId(Long id) {
        return dao.findById(id);
    }

    public void remover(Long id) {
        dao.delete(id);
    }
}
