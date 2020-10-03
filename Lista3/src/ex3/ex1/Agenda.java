package ex3.ex1;

/* @author Luam */

public class Agenda {
    Contato[] contatos = new Contato[50];
    int totalContatos = 0;

    void addContato(String nome, int num){
        Contato novo = new Contato(nome, num);
        totalContatos++;
    }   
}
