package ex3.ex1;

/* @author Luam */

public class Agenda {
    public Contato[] contatos = new Contato[50];
    public int totalContatos = 0;

    void addContato(String nome, int num){
        Contato novo = new Contato(nome, num);
        totalContatos++;
    }   
}
