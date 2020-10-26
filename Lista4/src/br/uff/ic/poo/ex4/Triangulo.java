package br.uff.ic.poo.ex4;
/* @author Luam */

public class Triangulo extends Figura{
    float base, altura;
    
    public Triangulo (String cor, float base,float altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea(){
        area = base*altura*0.5f;
            System.out.println("Area do Triangulo: "+area+" m²");
    }

}
