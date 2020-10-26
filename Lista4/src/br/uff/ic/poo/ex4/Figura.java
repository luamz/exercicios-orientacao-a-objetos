package br.uff.ic.poo.ex4;
/* @author Luam */

public class Figura {
    float area;
    String cor;

    public Figura(String cor) {
        this.cor = cor;
    }
    
   void calcularArea(){
       System.out.println("A figura eh um ponto e, portanto, nao tem area");
   }
}

