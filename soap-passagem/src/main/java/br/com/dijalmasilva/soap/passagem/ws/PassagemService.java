/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.passagem.ws;

import br.com.dijalmasilva.soap.passagem.model.Passagem;
import br.com.dijalmasilva.soap.passagem.repository.PassagemRepository;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author dijalmasilva
 */
@WebService
public class PassagemService {

    @EJB
    private PassagemRepository dao;

    public Passagem save(Passagem passagem) throws Exception {
        return dao.save(passagem);
    }

    public Passagem edit(Long id, Passagem passagem) {
        return dao.edit(id, passagem);
    }

    public Passagem findById(Long id) {
        return dao.findById(id);
    }

    public Passagem[] findAll() {
        return dao.findAll();
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
