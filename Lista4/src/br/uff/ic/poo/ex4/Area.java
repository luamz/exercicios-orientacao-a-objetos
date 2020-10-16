package br.uff.ic.poo.ex4;
/* @author Luam */

public class Area {   
    
    float area;
    double area2;
    
    void calcularArea(float x){
        this.area = x*x; 
        System.out.println("Area do quadrado: "+area+"m²");
    }
    void calcularArea(float x, float y, int lados){
        if (lados==4){
            this.area = x*y;
            System.out.println("Area do retangulo: "+area+"m²");
        }
        else if (lados==3){
            this.area =(float) (x*y*0.5);
            System.out.println("Area do triangulo: "+area+"m²");
        }
    }
    void calcularArea(double r){
        area2 = 3.14*r*r;
        System.out.println("Area do circulo: "+area2+"m²");
    }
}


