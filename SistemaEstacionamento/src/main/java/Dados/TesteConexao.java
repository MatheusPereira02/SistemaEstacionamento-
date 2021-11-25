/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsistemaestacionamento","root","");
        System.out.println("Funciona!");
        conexao.close();
    }
}

