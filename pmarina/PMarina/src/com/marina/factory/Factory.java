/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marina.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SUPORTE
 */
public class Factory {
    
    public Factory() throws ClassNotFoundException{
       
        conectar();
        
    }
    
    
    public static Connection conectar() throws ClassNotFoundException{
     
     String usuario = "root";
     String senha="root";    
     String url= "jdbc:mysql://localhost:3306/pmarina";
     
        Connection con=null;
            try{
            String driverName="org.gjt.mm.mysql.Driver";
            Class.forName(driverName);
            con= DriverManager.getConnection(url, usuario, senha);
        
           
           if(con != null){
              System.out.println("Conectado com sucesso!!");
               
           }else{
               System.out.println("Não Conectado com sucesso!!");
           }
            return con;
        }catch(SQLException ex){
            System.out.println("Não Conectou" + ex);
            
        }
        return con;
       
     
    }
       
     
    public void desconectar(Connection con) throws SQLException{
        
        try{
            con.close();
            
        }catch(SQLException ex){
            
            System.out.println("Não foi possivel desconectar" + ex);
            
        }
       
        
        
    }
    
    
}
