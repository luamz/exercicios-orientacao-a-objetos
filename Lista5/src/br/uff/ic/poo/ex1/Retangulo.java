package br.uff.ic.poo.ex1;
/* @author Luam */

public class Retangulo extends FormaGeometrica {
    
    public Retangulo(float area) {
        this.area = area;
    }
    
    void calcularArea(float lado1, float lado2){
        area = lado1 * lado2 ;
    }
    
    void calcularPerimetro(float lado1, float lado2){
        perimetro = (lado1*2) + (lado2*2) ;
    }
}