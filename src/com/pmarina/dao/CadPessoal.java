/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmarina.dao;

import com.pmarina.model.Cliente;
import com.pmarina.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jefferson
 */
public class CadPessoal {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
        public CadPessoal(Connection con){
            this.con=con;
        }
        
       public CadPessoal(){
           super();
       }
    
    public void cadFunc(Funcionario func) throws SQLException{
            
        String sql="insert into funcionarios(fnome, fcpf, fident, cep,"
                + "logradouro, bairro, cidade, uf, complemento, data_cadastro,"
                + "data_alteracao, usuario_alteracao, cargo, setor, obs)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1, func.getNome());
            pst.setString(2, func.getCpf());
            pst.setString(3, func.getIdent());
            pst.setString(4, func.getCep());
            pst.setString(5, func.getLogr());
            pst.setString(6, func.getBairro());
            pst.setString(7, func.getCidade());
            pst.setString(8, func.getUf());
            pst.setString(9, func.getComp());
            //pst.setString(10, func.getData_cadastro()); --> Inserir Data
            //pst.setString(11, func.getData_alteracao()); --> Inserir data
            pst.setString(12, func.getUsuarioAlt());
            pst.setString(13, func.getCargo());
            pst.setString(14, func.getSetor());
            pst.setString(15, func.getObs());
            pst.close();
        }catch(SQLException ex){
            
        }
            
        
    }
    
    public void cadCli(Cliente cli) throws SQLException{
        
        String sql="";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1, cli.getNome());
            pst.setString(2, cli.getCpf());
            pst.setString(3, cli.getIdent());
            pst.setString(4, cli.getCep());
            pst.setString(5, cli.getLogr());
            pst.setString(6, cli.getBairro());
            pst.setString(7, cli.getCidade());
            pst.setString(8, cli.getUf());
            pst.setString(9, cli.getComp());
            //pst.setString(10, func.getData_cadastro()); --> Inserir Data
            //pst.setString(11, func.getData_alteracao()); --> Inserir data
            pst.setString(15, cli.getObs());
            pst.close();
        }catch(SQLException ex){
            
        }
        
        
        
    }
    
}
