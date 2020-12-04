package br.uff.ic.poo.ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Luam */

public class CounterUser {
    public static void main(String[] args) { 
        Counter c = new Counter();
        Threads inc = new Threads("Incremento",c);
        Threads dec = new Threads("Decremento",c);
        
        try {
            inc.t.join(); 
            dec.t.join();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(CounterUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
