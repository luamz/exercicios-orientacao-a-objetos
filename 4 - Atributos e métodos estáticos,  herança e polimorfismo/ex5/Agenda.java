package br.uff.ic.poo.ex5;
import java.util.ArrayList;

/* @author Luam */

public class Agenda {
    ArrayList<Contato> agenda = new ArrayList<>();
    
    void addContato(Pf p){
        agenda.add(p);
    }
   
    void addContato(Pj p){
        agenda.add(p);
    }
    
    void buscarContato(int num){
        System.out.println("O contato buscado eh:");
        for (Contato c : agenda){
            if (c.codCadastro == num)
                c.imprimirContato();
            System.out.println();
        }
    }
    
    void imprimirTodos(){
        System.out.println("Todos os contatos da agenda:");
       for (Contato c : agenda){
            c.imprimirContato();
        } 
    }
}
