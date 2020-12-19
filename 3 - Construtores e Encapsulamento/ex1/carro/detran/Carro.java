package ex1.carro.detran;

import ex1.*;

/* @author Luam */

public class Carro {
    private  String placa;
    private String cor;
    private int ano;
    private String modelo;


    public Carro(String placa, int ano, String modelo, String cor) {
       this.placa = placa;
       this.modelo = modelo;
       this.ano = ano;
       this.cor=cor;
    }
    
    public void gerarImposto() {}
}
