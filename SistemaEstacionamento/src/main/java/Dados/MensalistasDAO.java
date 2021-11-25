
package Dados;

import Negocio.Mensalistas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class MensalistasDAO implements IMensalistasDAO{
    private Connection connection;
    
    
    public MensalistasDAO(){
        this.connection = new ConFatory().getConnection();
    }

    @Override
    public void adiciona(Mensalistas mensalistas) {
        
       String sql = "insert into mensalistas" + 
               "(nome,CPF,endereco,complemento,cidade,uf,empresa,telefone1,telefone2,mensalidade,placaveiculo,veiculo,periodo)" + 
               "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
       try{
           
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, mensalistas.getNome());
           stmt.setString(2, mensalistas.getCPF());
           stmt.setString(3, mensalistas.getEndereco());
           stmt.setString(4, mensalistas.getComplemento());
           stmt.setString(5, mensalistas.getCidade());
           stmt.setString(6, mensalistas.getUf());
           stmt.setString(7, mensalistas.getEmpresa());
           stmt.setString(8, mensalistas.getTelefone1());
           stmt.setString(9, mensalistas.getTelefone2());
           stmt.setString(10, mensalistas.getMensalidade());
           stmt.setString(11, mensalistas.getPlacaveiculo());
           stmt.setString(12, mensalistas.getVeiculo());
           stmt.setString(13, mensalistas.getPeriodo());
           
           
           
 
           
           stmt.execute();
           stmt.close();
           
           
       } catch (SQLException ex) {
           System.out.println("Houve um erro..." + ex.getMessage());
       }

  
       
    }

    @Override
    public void altera(Mensalistas mensalistas) {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public List<Mensalistas> listarTodos() {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public Object getByID(int id) {
        throw new UnsupportedOperationException(); 
    }
    
    
    
    
}
