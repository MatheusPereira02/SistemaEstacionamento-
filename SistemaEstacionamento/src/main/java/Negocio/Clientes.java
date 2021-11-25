
package Negocio;



/**
 *
 * @author Matheus
 */
public class Clientes {
    
    private int idClientes;
    private String nome;
    private String CPF;
    private String endereco;

    public Clientes(String nome, String CPF, String endereco) {
        
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

 

   

    public int getIdPaciente() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
    
}
