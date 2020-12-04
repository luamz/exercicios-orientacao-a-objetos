package br.uff.ic.poo.ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/*@author Luam */

public class ThreadPrimos implements Runnable{
    protected int n;

    public ThreadPrimos(int n) {
        this.n = n;
        Thread t = new Thread(this);
        t.start();
    }
    
    
    public boolean ehPrimo(int n){
         for (int j = 2; j < n; j++) {
            if (n % j == 0)
                return false;
         }
        return true;   
    }
 
    @Override
    public void run(){
        try {
            int contador = 0;
            String nums = "";
            
            
            Thread.sleep(100);
            
            for (int i=2; i<n;i++){
                if (ehPrimo(i)==true){
                    nums = nums.concat(i+" ");
                    contador++;
                }
            }
            System.out.printf("Entre 0 e %d temos %d numeros primos!\n", n, contador);
            System.out.println(nums);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPrimos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
}
