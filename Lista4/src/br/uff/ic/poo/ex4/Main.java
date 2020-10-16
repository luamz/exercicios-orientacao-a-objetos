/*Faça um programa que calcule a área de uma figura geométrica.
Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo.
Use herança e polimorfismo.  */
package br.uff.ic.poo.ex4;

/* @author Luam */
public class Main {
    public static void main(String[] args) {
        Area a = new Area();
        a.calcularArea(3);
    
        Area b = new Area();
        b.calcularArea(3, 10, 4);
        
        Area c = new Area();
        c.calcularArea(10, 20, 3);
    
        Area d = new Area();
        d.calcularArea(5.0);
    }
}