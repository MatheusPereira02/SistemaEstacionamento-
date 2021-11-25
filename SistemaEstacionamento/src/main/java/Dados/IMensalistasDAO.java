/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dados;
import Negocio.Mensalistas;
import java.util.List;



public interface IMensalistasDAO {
     public void adiciona(Mensalistas mensalistas);
    public void altera(Mensalistas mensalistas);
    public void remove(int id);
    public List<Mensalistas> listarTodos();
    public Object getByID(int id);
}
