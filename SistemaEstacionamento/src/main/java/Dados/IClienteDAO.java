/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dados;

import java.util.List;
import Negocio.Clientes;


public interface IClienteDAO {
    public void adiciona(Clientes clientes);
    public void altera(Clientes clientes);
    public void remove(int id);
    public List<Object> listarTodos();
    public Object getByID(int id);
}
