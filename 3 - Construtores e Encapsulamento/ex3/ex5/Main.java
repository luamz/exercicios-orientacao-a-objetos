/*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa;
abra e feche as mesmas como desejar.
Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.*/
package ex3.ex5;

/* @author Luam */
public class Main {
 public static void main(String[] args) {
     Casa casa = new Casa();
     casa.setCor("roxa");
     
     Porta p1 = new Porta(true);
     Porta p2 = new Porta(false);
     Porta p3 = new Porta(true);
     
     casa.addPortas(p1);
     casa.addPortas(p2);
     casa.addPortas(p3);
     
     System.out.printf("A casa é %s e ", casa.getCor());
     casa.quantasAbertas();
 }   
}
