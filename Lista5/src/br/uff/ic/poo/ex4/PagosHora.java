package br.uff.ic.poo.ex4;
/* @author Luam */

public class PagosHora extends Funcionario{
    int qtdeHoras;
    float salarioHora;

    public PagosHora(String nome, int qtdeHoras, float salarioHora) {
        super(nome, "Pago por hora");
        this.qtdeHoras = qtdeHoras;
        this.salarioHora = salarioHora;
    }
    
    @Override
    void calcularSalario(){
        if (qtdeHoras>40){
            salario = (salarioHora * 40)+(salarioHora * 1.5f * (qtdeHoras-40));
        }
        else{
            salario = qtdeHoras * salarioHora;
        }
        
        System.out.printf("O salário do(a) funcionario(a) %s é: R$%.2f (%s)\n", nome, salario, tipo);
    }
    
}
