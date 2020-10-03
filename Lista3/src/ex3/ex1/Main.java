/* Faça um programa de agenda telefônica, com as classes Agenda e Contato */
package ex3.ex1;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        System.out.println("------------Agenda------------");
        
        String nome = "Samuel";
        int num = 40028922;
        agenda.addContato(nome, num);
        System.out.printf("%s foi adicionado(a) a sua agenda!\n", nome);
        
        String nome2 = "Rita";
        int num2 = 227038894;
        agenda.addContato(nome2, num2);
        System.out.printf("%s foi adicionado(a) a sua agenda!\n", nome2);
        
        int total;
        total = agenda.totalContatos;
        System.out.printf("Total de contatos: %d \n", total);     
        
    }
    
}
