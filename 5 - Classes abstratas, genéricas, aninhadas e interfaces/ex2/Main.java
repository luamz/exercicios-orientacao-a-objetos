package br.uff.ic.poo.ex2;
import java.util.ArrayList;
/* @author Luam  */

public class Main {
    public static void main(String[] args) {
        System.out.print("Cálculo de Pegada de Carbono\n");
        System.out.print("------------------------------------------------------\n");
        Construcao casa1 = new Construcao(5, 40 , false, false);
        Construcao casa2 = new Construcao(5, 70 , true, true);
      
        Carro carro1 = new Carro (20,1.0f,"Gasolina");
        Carro carro2 = new Carro (20,2.0f,"Alcool");
        Carro carro3 = new Carro (20,1.8f,"Eletrico");
      
        Bicicleta bike1 = new Bicicleta (29,20);
        Bicicleta bike2 = new Bicicleta (29,20, 0.05f);
      
        ArrayList <CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
    
        lista.add(casa1);
        lista.add(carro1);
        lista.add(bike1);
   
        lista.add(casa2);
        lista.add(carro2);
        lista.add(bike2);
        lista.add(carro3);
      
        for (CarbonFootprint item : lista ){
            item.getCarbonFootprint();
        }
    }
}