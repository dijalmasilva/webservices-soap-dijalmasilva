/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.cliente.beans;

import br.com.dijalmasilva.soap.cliente.model.Cliente;
import br.com.dijalmasilva.soap.cliente.repository.ClienteRepository;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author dijalmasilva
 */
@ManagedBean
@ViewScoped
public class ClienteController implements Serializable {

    private Cliente cliente;
    private boolean showSave;
    private boolean showList;
    private boolean showEdit;
    private Long idClientEdit;

    @EJB
    private ClienteRepository dao;

    public ClienteController() {
        this.cliente = new Cliente();
        this.idClientEdit = 0L;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void salvarCliente() {
        System.out.println("CHAMOU FUNÇÃO SALVAR CLIENTE");
        dao.save(cliente);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Sucesso!", "Cliente cadastrado!"));
        cliente = new Cliente();
    }

    public Cliente[] listar() {
        return dao.findAll();
    }

    public Cliente editarCliente() {
        Cliente edit = dao.edit(idClientEdit, cliente);
        this.showEdit = false;
        this.showSave = false;
        this.showList = true;
        this.cliente = new Cliente();
        this.idClientEdit = null;
        return edit;
    }

    public void deletarCliente(Long id) {
        System.out.println("CLIENTE A DELETAR: " + id);
        dao.delete(id);
        setShowList(true);
    }

    public boolean isShowSave() {
        return showSave;
    }

    public boolean isShowList() {
        return showList;
    }

    public boolean isShowEdit() {
        return showEdit;
    }

    public void setShowSave(boolean showSave) {
        System.out.println("CHAMOU NOVO CLIENTE");
        this.showSave = showSave;
        this.showList = !showSave;
        this.showEdit = !showSave;
    }

    public void setShowList(boolean showList) {
        System.out.println("CHAMOU LISTAR CLIENTE");
        this.showList = showList;
        this.showSave = !showList;
        this.showEdit = !showList;
    }

    public void setShowEdit(boolean showEdit, Long clientId, Cliente cliente) {
        this.idClientEdit = clientId;
        this.cliente = cliente;
        this.showEdit = showEdit;
        this.showList = !showEdit;
        this.showSave = !showEdit;
    }

    public void resetAll() {
        this.showEdit = this.showList = this.showSave = false;
    }

    public Long getIdClientEdit() {
        return idClientEdit;
    }

    public void setIdClientEdit(Long idClientEdit) {
        this.idClientEdit = idClientEdit;
    }

}
