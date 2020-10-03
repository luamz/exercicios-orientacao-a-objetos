/*Crie uma porta, abra e feche a mesma, pinte-a de diversas cores,
altere suas dimensões e use o método estaAberta para verificar se ela está aberta.*/
package ex3.ex4;
/* @author Luam */
public class Main {
     public static void main(String[] args) {
        Porta porta = new Porta("vermelha", 2.10f, 0.80f);
        porta.imprimir();
        porta.estaAberta();
        
        porta.setCor("preta");
        porta.setAltura(2.20f);
        porta.setLargura(0.90f);
        porta.setEstado(false);
        
        porta.imprimir();
        porta.estaAberta();
    }
}
