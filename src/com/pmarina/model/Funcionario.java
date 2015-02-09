/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmarina.model;

import java.sql.Date;

/**
 *
 * @author Jefferson
 */
public class Funcionario extends Pessoa{
    
 
   
   private Date data_cadastro;
   private Date data_alteracao;
   private String usuarioAlt;
   private String cargo;
   private String setor;
   private String obs;

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Date getData_alteracao() {
        return data_alteracao;
    }

    public void setData_alteracao(Date data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public String getUsuarioAlt() {
        return usuarioAlt;
    }

    public void setUsuarioAlt(String usuario) {
        this.usuarioAlt = usuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
   
    
}
