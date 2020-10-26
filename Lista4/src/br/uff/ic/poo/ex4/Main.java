/*Faça um programa que calcule a área de uma figura geométrica.
Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo.
Use herança e polimorfismo.  */
package br.uff.ic.poo.ex4;

/* @author Luam */
public class Main {
    public static void main(String[] args) {
        
        Retangulo a = new Retangulo("Verde", 3, 3);
        a.calcularArea();
    
        Retangulo b = new Retangulo("Azul", 3, 2);
        b.calcularArea();
        
        Triangulo c = new Triangulo("Vermelho", 10, 20);
        c.calcularArea();
    
        Circulo d = new Circulo("Preto", 5);
        d.calcularArea();
        
        Figura e = new Figura("Roxo");
        e.calcularArea();
    }
}