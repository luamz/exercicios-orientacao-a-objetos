/*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa;
abra e feche as mesmas como desejar.
Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.*/
package ex5;

/* @author Luam */
public class main {
 public static void main(String[] args) {
     Casa casa = new Casa();
     casa.cor = "roxa";
     
     Porta p1 = new Porta();
     Porta p2 = new Porta();
     Porta p3 = new Porta();
    
     p1.estado = true;
     p2.estado = false;
     p3.estado = true;
     
     casa.addPortas(p1);
     casa.addPortas(p2);
     casa.addPortas(p3);
     
     System.out.printf("A casa é %s e ", casa.cor );
     casa.quantasAbertas();
 }   
}
