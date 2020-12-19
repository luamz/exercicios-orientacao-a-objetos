package br.uff.ic.poo.ex1;
/* @author Luam */ 

public class Circulo extends FormaGeometrica {

    public Circulo(float area) {
        this.area = area;
    }
    
    
    
    void calcularArea(float raio){
        area = 3.14f *raio*raio;
    }
    
    void calcularPerimetro(float raio){
        perimetro = 2 * 3.14f * raio;
    }
}
