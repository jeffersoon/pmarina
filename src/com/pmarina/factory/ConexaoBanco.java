/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmarina.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jefferson
 */
public class ConexaoBanco {
    Connection con;
    // private static String status = "Nao conectado";
    
  
    public Connection open() throws ClassNotFoundException{
        
     Connection con = null ;
                try{
         String DriverName="org.gjt.mm.mysql.Driver";
         Class.forName(DriverName);
         
         String url="jdbc:mysql://localhost:3306/pmarina";
         String login="root";
         String senha="root";
          
         
         con = DriverManager.getConnection(url,login,senha);
      /*   
         if(con != null) -- -- teste de conexao{
             status=("Status--->Conectado com sucesso");
             System.out.println("Conectado");
             
         }else{
         
             status=("STATUS---> não foi possivel estabeler uma conexao");
                          System.out.println(" Não Conectado");

             
         }
         */
            return con;
        } catch (SQLException ex) {
        System.out.println("Nao foi possivel conectar ao Banco de Dados." + ex);
        return con;
        } catch (ClassNotFoundException e) {
          System.out.println("O driver expecificado nao foi encontrado." + e);
          return con;
        }
                
        
    }
 /*   public static String StatusConexao(){ -- - teste de conexao
    
    return status;
    
    
    }
    */
    
    
    
    
}
