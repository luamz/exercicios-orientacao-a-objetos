package br.uff.ic.poo.ex8;
import br.uff.ic.poo.ex1.*;

/* @author Luam */

public class Generico {
    
    public static void main(String[] args){
    Circulo cir = new Circulo(3);
    Quadrado qua = new Quadrado(4);
    Triangulo tri = new Triangulo(5);
    Retangulo ret = new Retangulo(6);
    
    FormaGeometrica array[] = {cir, qua, tri, ret};
    System.out.println("A soma das áreas das figuras do vetor é: " + soma(array));
    }
    
    
    public static <T extends FormaGeometrica> float soma(T array[]){
        float soma = 0;
        for (T elemento:array){
            soma += elemento.area;
        }
        return soma;
    }     
}
