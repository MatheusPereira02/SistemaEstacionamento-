/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dados;

import Negocio.Veiculos;
import java.util.List;

/**
 *
 * @author Matheus
 */
public interface IVeiculosDAO {
     public void adiciona(Veiculos veiculos);
    public void altera(Veiculos veiculos);
    public void remove(int id);
    public List<Object> listarTodos();
    public Object getByID(int id);
}
