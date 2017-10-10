/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.cliente.ws;

import br.com.dijalmasilva.soap.cliente.model.Cliente;
import br.com.dijalmasilva.soap.cliente.repository.ClienteRepository;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author dijalmasilva
 */
@WebService
public class ClienteService {

    @EJB
    private ClienteRepository dao;

    public void save(Cliente cliente) {
        dao.save(cliente);
    }

    public Cliente edit(Long id, Cliente cliente) {
        return dao.edit(id, cliente);
    }

    public Cliente findById(Long id) {
        return dao.findById(id);
    }

    public Cliente findByCpf(String cpf) {
        return dao.findByCpf(cpf);
    }

    public Cliente[] findAll() {
        return dao.findAll();
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
