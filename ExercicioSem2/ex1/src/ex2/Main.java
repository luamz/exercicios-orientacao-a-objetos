/*Crie uma pessoa, coloque seu nome e idade iniciais,
faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade. */
package ex2;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
    Pessoa percy= new Pessoa();
    Pessoa annabeth = new Pessoa();
    
    percy.nome="Percy Jackson";
    percy.idade=12;
    
    annabeth.nome="Annabeth Chase";
    annabeth.idade=12;
    
    percy.imprimir();
    annabeth.imprimir();
    
    percy.fazAniversario();
    annabeth.fazAniversario();
    
    percy.imprimir();
    annabeth.imprimir();
    
    percy.fazAniversario();
    annabeth.fazAniversario();
    
    percy.imprimir();
    annabeth.imprimir();
    }
}
