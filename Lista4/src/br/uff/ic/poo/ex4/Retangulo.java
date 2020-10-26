package br.uff.ic.poo.ex4;
/* @author Luam */

public class Retangulo extends Figura {
      float base, altura;
    
    public Retangulo (String cor, float base,float altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    
      @Override
    void calcularArea(){
        this.area = base * altura;
        if (base == altura)
            System.out.println("Area do Quadrado: "+ area +" m²");
        else
            System.out.println("Area do Retangulo: " + area + " m²");
    }
    
}
