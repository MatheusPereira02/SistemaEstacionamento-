/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import Negocio.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO implements IClienteDAO {
    
   private Connection connection;

    public ClienteDAO() {
        this.connection = new ConFatory().getConnection();
    }
   
    
   public void adiciona(Clientes clientes){
       
       String sql = "insert into clientes"+ 
               "(nome,cpf,endereco)" + 
               "values(?,?,?)";
       
       
       
       try{
           
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, clientes.getNome());
           stmt.setString(2, clientes.getCPF());
           stmt.setString(3, clientes.getEndereco());
          
           
           
           
           stmt.execute();
           stmt.close();
           
           
       } catch (SQLException ex) {
           System.out.println("Houve um erro..." + ex.getMessage());
       }
   }

   
    

   
    public void altera(Clientes cliente) {
        throw new UnsupportedOperationException(); 
    }

 
    public void remove(int id) {
        throw new UnsupportedOperationException(); 
    }

    
    public List<Object> listarTodos() {
        throw new UnsupportedOperationException(); 
    }

    
    public Object getByID(int id) {
        throw new UnsupportedOperationException(); 
      
}
}