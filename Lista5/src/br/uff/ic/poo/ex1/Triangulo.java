package br.uff.ic.poo.ex1;
/* @author Luam */

public class Triangulo extends FormaGeometrica {
     void calcularArea(float base, float altura){
        area = (base * altura)/2 ;
    }
    
    void calcularPerimetro(float lado1, float lado2, float lado3){
        perimetro = lado1 + lado2 + lado3;
    }
}
