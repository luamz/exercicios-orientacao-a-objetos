package br.uff.ic.poo.ex2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Luam */

public class Threads implements Runnable{
    public Counter c;
    public Thread t;
    public Boolean estaSuspensa;

    final int NUM = 20;

    public Threads(String nome, Counter c){
            this.c = c;
            t = new Thread(this, nome);
            t.start();
    }
    
   
    @Override
    public void run() {
        Random r = new Random();
        if (t.getName().equals("Incremento")){
            for (int i=0; i<NUM; i++)
                    c.increment(true);
            c.increment(false);
            
            /// suspensão por um período de tempo aleatório entre 0 e 500 milisegundos
            synchronized (this) {
            try {
                wait(r.nextInt(501));
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
            
        } else {
            for (int i=0; i<NUM; i++)
                c.decrement(true);
            c.decrement(false);
            
            /// suspensão por um período de tempo aleatório entre 0 e 500 milisegundos
            synchronized (this) {
                try {
                    wait(r.nextInt(501));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
