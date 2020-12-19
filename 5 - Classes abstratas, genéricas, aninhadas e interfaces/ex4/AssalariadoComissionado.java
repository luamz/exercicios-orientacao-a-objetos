package br.uff.ic.poo.ex4;
/* @author Luam */

public class AssalariadoComissionado extends Funcionario{
    float totalVendas;
    float salarioBase;
   

    public AssalariadoComissionado(String nome, float totalVendas, float salarioBase) {
        super(nome, "Assalariado comissionado");
        this.totalVendas = totalVendas;
        this.salarioBase = salarioBase;
        this.bonus = (salarioBase*0.1f);
    }
    
    @Override
    void calcularSalario(){
        salario = salarioBase + totalVendas * (0.1f) + bonus;
        System.out.printf("O salário do(a) funcionario(a) %s é: R$%.2f (%s)\n", nome, salario, tipo);
    }
}
