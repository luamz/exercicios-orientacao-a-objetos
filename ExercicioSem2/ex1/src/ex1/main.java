/* Faça um programa de agenda telefônica, com as classes Agenda e Contato */
package ex1;
/* @author Luam */

public class main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        String nome = "Samuel";
        int num = 40028922;
        agenda.addContato(nome, num);
        System.out.println("Contato adicionado!");
        
        String nome2 = "Rita";
        int num2 = 227038894;
        agenda.addContato(nome2, num2);
        System.out.println("Contato adicionado!");
        
        int total;
        total = agenda.totalContatos;
        System.out.printf("Total de contatos: %d ", total);     
        
    }
    
}
