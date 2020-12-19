package br.uff.ic.poo.ex4;
/* @author Luam */

public class Funcionario {
    String nome;
    String tipo;
    float salario;
    float bonus;

    public Funcionario(String nome, String tipo, float salario) {
        this.nome = nome;
        this.tipo = tipo;
        this.salario = salario;
    }    
    
     public Funcionario(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }    
    
    void calcularSalario(){
        System.out.printf("O salário do(a) funcionario(a) %s é: R$%.2f (%s)\n", nome, salario, tipo);
    }
}
