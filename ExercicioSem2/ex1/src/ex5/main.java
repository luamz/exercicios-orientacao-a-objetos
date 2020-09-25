/*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa;
abra e feche as mesmas como desejar.
Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.*/
package ex5;

/* @author Luam */
public class main {
 public static void main(String[] args) {
     Casa casa = new Casa();
     casa.portas[0] = new Porta();
     casa.portas[1] = new Porta();
     casa.portas[2] = new Porta();
     
     casa.portas[0].estado= false;
     casa.quantasAbertas();
     
     casa.portas[1].estado= false;
     casa.quantasAbertas();
     
     casa.portas[2].estado= false;
     casa.quantasAbertas();
 }   
}
