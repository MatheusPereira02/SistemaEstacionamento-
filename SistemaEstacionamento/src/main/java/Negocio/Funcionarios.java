/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author Matheus
 */
public class Funcionarios {
    
    private int idFuncionarios;
    private String nome;
    private String CPF;
    private String endereco;
    private String login;
    private String senha;

    public Funcionarios( String nome, String CPF, String endereco, String login, String senha) {
        this.idFuncionarios = idFuncionarios;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
        
    }

    public int getIdFuncionarios() {
        return idFuncionarios;
    }

    public void setIdFuncionarios(int idFuncionarios) {
        this.idFuncionarios = idFuncionarios;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public String setSenha(String senha){
        return senha;
    }
    
    
    
    
    
}
