/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.Calendar;

/**
 *
 * @author Matheus
 */
public class Mensalistas {
    private int idMensalistas;
    private String nome;
    private String CPF;
    private String endereco;
    private String complemento;
    private String cidade;
    private String uf;
    private String empresa;
    private String telefone1;
    private String telefone2;
    private String mensalidade;
    private String placaveiculo;
    private String veiculo;
    private String periodo;

    public Mensalistas(String nome, String CPF, String endereco, String complemento, String cidade, String uf, String empresa, String telefone1, String telefone2, String mensalidade, String placaveiculo, String veiculo, String periodo) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.empresa = empresa;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.mensalidade = mensalidade;
     
        this.placaveiculo = placaveiculo;
        this.veiculo = veiculo;
        this.periodo = periodo;
    }

    public int getIdMensalistas() {
        return idMensalistas;
    }

    public void setIdMensalistas(int idMensalistas) {
        this.idMensalistas = idMensalistas;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(String mensalidade) {
        this.mensalidade = mensalidade;
    }


    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

  
    
    
    
}
