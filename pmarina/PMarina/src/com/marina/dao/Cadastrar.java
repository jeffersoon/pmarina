/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marina.dao;

import com.marina.factory.Factory;
import com.marina.model.Cliente;
import com.marina.model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SUPORTE
 */
public class Cadastrar {
    public void cadCliente(Cliente c) throws ClassNotFoundException{
        try{
           PreparedStatement pst = null;
    String sql = "INSERT INTO CLIENTE(nome, cpf, logradouro, nrCasa,"
                  + "complemento, bairro, cidade, uf) VALUES (?,?,?,?,?,?,?,?)";
                pst = Factory.conectar().prepareStatement(sql);
                    pst.setString(1, c.getNome());
                    pst.setString(2, c.getCpf());
                    pst.setString(3, c.getLogradouro());
                    pst.setString(4, c.getNr_casa());
                    pst.setString(5, c.getComplemento());
                    pst.setString(6, c.getBairro());
                    pst.setString(7, c.getCidade());
                    pst.setString(8, c.getUf());
                        pst.execute();
                        pst.close();
            
        }catch(SQLException e){
            
            System.out.println("Não foi possivel inserir Cliente" + e);
            
        }
        
    }
    
    
    public void cadFuncionario(Funcionario func){
        try{
            PreparedStatement pst = null;
         String sql="INSERT INTO FUNCIONARIO(fnome, fcpf, fidentidade,"
                 + "cep, logradouro, nrcasa, complemento, bairro, cidade, uf,"
                 + " usuario, senha, cargo, setor, celular, fone) VALUES (?,?,?,"
                 + "?,?,?,?,?,?,?,?,?,?,?,?,?)";
         pst.setString(1, func.getNome());
         pst.setString(2, func.getCpf());
         pst.setString(3, func.getIdentidade());
         pst.setString(4, func.getCep());
         pst.setString(5, func.getLogradouro());
         pst.setString(6, func.getNr_casa());
         pst.setString(7, func.getComplemento());
         pst.setString(8, func.getBairro());
         pst.setString(9, func.getCidade());
         pst.setString(10, func.getUf());
         pst.setString(11, func.getUsuario());
         pst.setString(12, func.getSenha());
         pst.setString(13, func.getCargo());
         pst.setString(14, func.getSetor());
         pst.setString(15, func.getCelular());
         pst.setString(16, func.getFone());
         
            pst.execute();
            pst.close();       
            
        
        }catch(SQLException e){
            System.out.println("Não foi possivel inserir Funcionario" + e);
            
        }
        
        
        
    }
    
}
