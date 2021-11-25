/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dados;

import java.util.List;

/**
 *
 * @author Matheus
 */
public interface IDAO {
     public void adiciona(Object obj);
    public void altera(Object obj);
    public void remove(int id);
    public List<Object> listarTodos();
    public Object getByID(int id);
}
