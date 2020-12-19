/*Crie uma pessoa, coloque seu nome e idade iniciais,
faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade. */
package ex3.ex2;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
    Pessoa percy= new Pessoa("Percy Jackson", 12);
    Pessoa annabeth = new Pessoa("Annabeth Chase", 12);
    
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
