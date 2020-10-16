/*Faça um programa para representar a árvore genealógica de uma família.
Para tal, crie uma classe Pessoa que permita indicar, além de nome e idade,
o pai e a mãe. Tenha em mente que pai e mãe também são do tipo Pessoa.  */

package br.uff.ic.poo.ex3.main;
import br.uff.ic.poo.ex3.Filho;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
    
        Filho antonio = new Filho("Antonio", 41);
        Filho paula = new Filho("Paula", 40);
        Filho luisa = new Filho("Luisa", 20, antonio, paula);
        
        Filho pedro = new Filho("Pedro", 50);
        Filho amanda = new Filho("Amanda", 52);
        Filho jorge = new Filho("Jorge", 25, pedro, amanda);

        Filho breno = new Filho("Breno", 2, jorge, luisa);
        
        breno.imprimirPais();
        jorge.imprimirPais();
        luisa.imprimirPais();
    }  
}
