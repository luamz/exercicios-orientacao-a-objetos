package br.uff.ic.poo.ex1;
/* @author Luam */

public class Quadrado extends Retangulo{

    public Quadrado(float area) {
        super(area);
    }
    
    void calcularArea(float lado){
        area = lado * lado ;
    }

    void calcularPerimetro(float lado){
        perimetro = lado * 4 ;
    }
}
