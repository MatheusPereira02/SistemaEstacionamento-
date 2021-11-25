/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import Negocio.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class FuncionariosDAO implements IFuncionariosDAO{

   private Connection connection;
    
    
    public FuncionariosDAO(){
      this.connection = new ConFatory().getConnection();  
    }
    
    public void adiciona(Funcionarios funcionarios) {
      
        String sql = "insert into funcionarios"+"(nome,cpf,endereco,login,senha)" + "values(?,?,?,?,?)";
             
        try{
           
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, funcionarios.getNome());
           stmt.setString(2, funcionarios.getCPF());
           stmt.setString(3, funcionarios.getEndereco());
           stmt.setString(4, funcionarios.getLogin());
           stmt.setString(5, funcionarios.getSenha());
           
           
           
           stmt.execute();
           stmt.close();
           
           
       } catch (SQLException ex) {
           System.out.println("Houve um erro..." + ex.getMessage());
       }
   
    }

    @Override
    public void altera(Funcionarios funcionarios) {
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
