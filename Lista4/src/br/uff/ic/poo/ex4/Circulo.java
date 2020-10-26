package br.uff.ic.poo.ex4;

/* @author Luam */
public class Circulo extends Figura {
    float raio;

    public Circulo(String cor, float raio) {
        super(cor);
        this.raio = raio;
    }
    @Override
    void calcularArea(){
        area = 3.14f *raio*raio;
        System.out.println("Area do Circulo: "+area+"m²");
    }
}
