package br.uff.ic.poo.ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Luam */
public class Counter{
    private int count;
   
    synchronized void increment(boolean emUso){
        if ((count<3) &&  (Math.random()>0)){
            count ++;
            notify();
            System.out.printf("Contador incrementado!\nContador: %d\n\n", count);
            return;
        }
        
        else{
            try {
                System.out.println("-------------------------------"
                        + "\nEm espera pois o contador esta cheio!\n"
                        + "-------------------------------");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    synchronized void decrement(boolean emUso){
        if ((count>0) &&  (Math.random()>0)){
            count--;
            notify();
            System.out.printf("Contador decrementado!\nContador: %d\n\n", count);
            return;
        }
        
        else{
            try {
                 System.out.println("-------------------------------"
                        + "\nEm espera pois o contador esta vazio!\n"
                        + "-------------------------------");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
