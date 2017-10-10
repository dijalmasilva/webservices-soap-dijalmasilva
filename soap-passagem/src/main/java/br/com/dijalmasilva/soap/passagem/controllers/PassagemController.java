/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijalmasilva.soap.passagem.controllers;

import br.com.dijalmasilva.soap.passagem.exceptions.PassagemException;
import br.com.dijalmasilva.soap.passagem.model.Passagem;
import br.com.dijalmasilva.soap.passagem.repository.PassagemRepository;
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
public class PassagemController implements Serializable {

    @EJB
    private PassagemRepository passagemDao;
    private Passagem passagem;

    private boolean showSave;
    private boolean showEdit;
    private boolean showList;

    public PassagemController() {
        this.passagem = new Passagem();
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public void salvarPassagem() {
        try {
            passagemDao.save(passagem);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Sucesso!", "Passagem emitida!"));
        } catch (PassagemException ex) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Erro!", ex.getMessage()));
        }

        passagem = new Passagem();
    }

    public void editarPassagem() {
        passagemDao.edit(passagem.getId(), passagem);
        setShowList(true);
        passagem = new Passagem();
    }

    public Passagem[] listar() {
        return passagemDao.findAll();
    }

    public void deletarPassagem(Long idPassagem) {
        passagemDao.delete(idPassagem);
        setShowList(true);
    }

    public boolean isShowSave() {
        return showSave;
    }

    public void setShowSave(boolean showSave) {
        setAllFalse();
        this.showSave = showSave;
    }

    public boolean isShowEdit() {
        return showEdit;
    }

    public void setShowEdit(boolean showEdit, Passagem passagem) {
        setAllFalse();
        this.passagem = passagem;
        this.showEdit = showEdit;
    }

    public boolean isShowList() {
        return showList;
    }

    public void setShowList(boolean showList) {
        setAllFalse();
        this.showList = showList;
    }

    private void setAllFalse() {
        this.showEdit = this.showList = this.showSave = false;
    }
}
