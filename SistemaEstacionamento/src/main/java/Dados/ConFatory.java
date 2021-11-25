/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConFatory {
    

    private static final String SERVIDOR = "localhost";
    private static final String PORTA = "3306";
    private static final String DB = "dbsistemaestacionamento";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://"+SERVIDOR+":"+PORTA+"/"+DB,USUARIO, SENHA);
             } catch (SQLException ex) {
            //Logger.getLogger(ConFactory.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
}

