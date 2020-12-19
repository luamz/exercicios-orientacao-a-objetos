package br.uff.ic.poo.ex4;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
        System.out.println("Folha de Pagamento\n-------------------------------------------------------");
        Funcionario thereza = new Assalariado("Thereza", 2000);
        Funcionario domingos = new PagosHora("Domingos", 60, 90);
        Funcionario antonio = new Comissionado("Antonio", 20000);
        Funcionario marcelino = new AssalariadoComissionado("Marcelenino", 20000, 1000); 
    
        thereza.calcularSalario();
        domingos.calcularSalario();
        antonio.calcularSalario();
        marcelino.calcularSalario();
    }
}
