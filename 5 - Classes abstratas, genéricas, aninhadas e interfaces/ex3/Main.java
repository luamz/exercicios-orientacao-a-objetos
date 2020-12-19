package br.uff.ic.poo.ex3;
import java.util.ArrayList;
/* @author Luam  */

public class Main {
    public static void main(String[] args) {
        System.out.print("Cálculo de Pegada de Carbono\n");
        System.out.print("------------------------------------------------------\n");
        Construcao escola = new Escola(5, 40, 20, false, false);
        Construcao casa = new Casa(5, 70, 3, true, true);
      
        // Não. Pois as subclasses não implementam a interface diretamete.
        ArrayList <Construcao> lista = new ArrayList<Construcao>();
        
        lista.add(casa);
        lista.add(escola);
        
      
        for (Construcao item : lista ){
            item.getCarbonFootprint();
        }
    }
}