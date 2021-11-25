/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author Matheus
 */
public class Veiculos {
    private int idVeiculos;
    private String modelo;
    private String descricao;
    private String placa;

    public Veiculos( String modelo, String descricao, String placa) {
        this.idVeiculos = idVeiculos;
        this.modelo = modelo;
        this.descricao = descricao;
        this.placa = placa;
    }

    public int getIdVeiculos() {
        return idVeiculos;
    }

    public void setIdVeiculos(int idVeiculos) {
        this.idVeiculos = idVeiculos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
