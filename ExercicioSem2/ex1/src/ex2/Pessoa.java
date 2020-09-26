package ex2;
/* @author Luam */

public class Pessoa {
    String nome;
    int idade;
    
    void fazAniversario(){
        idade++;
    }
    
    void imprimir(){
        System.out.print(nome +", "+ idade + " anos \n");
    }
}
