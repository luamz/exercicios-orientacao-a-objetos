package ex1.carro.locadora;

/* @author Luam */

public class Carro {
    private  String placa;
    private int ano;
    private float preco;
    private String modelo;

    public Carro(String placa, int ano, String modelo, int preco) {
       this.placa = placa;
       this.modelo = modelo;
       this.ano = ano;
       this.preco=preco;
    }

    public void alugar() {} 
}
