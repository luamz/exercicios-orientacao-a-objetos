package br.uff.ic.poo.ex4;
/* @author Luam */

public class Comissionado extends Funcionario{
    float totalVendas;

    public Comissionado(String nome, float totalVendas) {
        super(nome, "Comissionado");
        this.totalVendas = totalVendas;
    }
    
    @Override
    void calcularSalario(){
        salario = totalVendas * (0.2f);
        System.out.printf("O salário do(a) funcionario(a) %s é: R$%.2f (%s)\n", nome, salario, tipo);
    }
}
