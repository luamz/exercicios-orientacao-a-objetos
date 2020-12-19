package br.uff.ic.poo.ex2;
/* @author Luam */

public class Bicicleta implements CarbonFootprint{
    int aro;
    boolean motorizada;
    int distancia;
    float cilindradas;
    float total;

    public Bicicleta(int aro, int distancia) {
        this.aro = aro;
        this.distancia = distancia;
        this.motorizada = false;
    }

    public Bicicleta(int aro, int distancia, float cilindradas) {
        this.aro = aro;
        this.distancia = distancia;
        this.cilindradas = cilindradas;
        this.motorizada = true;
    }

    // Não achei uma fórmula exata para o cálculo, então utilizei uma baseado na distancia/cilindradas para 1km
    
    @Override
    public void getCarbonFootprint() {
        if (!motorizada){
            System.out.print("Uma bicicleta não emite pegadas de carbono!!\n");
        }
        else{
            total = (distancia/aro)* (cilindradas/10) * 0.4f;
            System.out.printf("Uma bicicleta motorizada emite %.2fkg de pegadas de carbono a cada %dkm.\n", total, distancia );   
        }
    }
    
}
