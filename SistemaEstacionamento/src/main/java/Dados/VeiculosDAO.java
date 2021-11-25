/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import Negocio.Veiculos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author Matheus
 */
public class VeiculosDAO implements IVeiculosDAO{

     private Connection connection;
     
     public VeiculosDAO() {
        this.connection = new ConFatory().getConnection();
    }
     
     
    public void adiciona(Veiculos veiculos) {
        
         String sql = "insert into veiculos"+ 
               "(modeloveiculo,placaveiculo,corveiculo)" + 
               "values(?,?,?)";
    
    try{
           
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, veiculos.getModelo());
           stmt.setString(2, veiculos.getDescricao());
           stmt.setString(3, veiculos.getPlaca());
          
           
           
           
           stmt.execute();
           stmt.close();
           
           
       } catch (SQLException ex) {
           System.out.println("Houve um erro..." + ex.getMessage());
       }
    }

    @Override
    public void altera(Veiculos veiculos) {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public List<Object> listarTodos() {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public Object getByID(int id) {
        throw new UnsupportedOperationException(); 
    }
    
}
