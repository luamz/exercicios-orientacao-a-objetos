package br.uff.ic.poo.ex2;
/* @author Luam */

public class Carro implements CarbonFootprint {
    int distancia;
    float cilindradas;
    String combustivel;
    float total;

    public Carro(int distancia, float cilindradas, String combustivel) {
        this.distancia = distancia;
        this.cilindradas = cilindradas;
        this.combustivel = combustivel;
    }
    
// Não achei uma fórmula exata para o cálculo, então utilizei uma baseado na distancia/cilindradas para 1km
    @Override
    public void getCarbonFootprint() {
        if (combustivel.equals("Gasolina")){
            total = (distancia)* (cilindradas) * 0.4f; 
            System.out.printf("Um carro %.1f a gasolina emite %.2fkg de pegadas de carbono a cada %dkm.\n", cilindradas, total, distancia );   
        }
        else if (combustivel.equals("Alcool")){
            total = (distancia)* (cilindradas) * 0.35f;
            System.out.printf("Um carro %.1f a alcool emite %.2fkg de pegadas de carbono a cada %dkm.\n", cilindradas, total, distancia );
        }
        
        else if (combustivel.equals("Eletrico")){
            total = (distancia)* (cilindradas) * 0.12f;
            System.out.printf("Seu carro elétrico emite %fkg de pegadas de carbono a cada %dkm.\n", total, distancia );   
        }
    }
}
