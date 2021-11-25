/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dados;

import Negocio.Funcionarios;
import java.util.List;


public interface IFuncionariosDAO {
     public void adiciona(Funcionarios funcionarios);
    public void altera(Funcionarios funcionarios);
    public void remove(int id);
    public List<Object> listarTodos();
    public Object getByID(int id);
}
