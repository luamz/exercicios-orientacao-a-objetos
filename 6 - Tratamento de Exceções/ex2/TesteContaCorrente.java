
package br.uff.ic.poo.ex2;

/* @author Luam */
public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente nova = new ContaCorrente(1000, 2000, 5000);
        
        try{
            nova.sacar(10);
            nova.sacar(4000);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
         try{
            nova.depositar(500);
            nova.depositar(-1000);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
         
         
         try{
            nova.setValorLimite(10000);
            nova.setValorLimite(-100);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } 
    }
}
