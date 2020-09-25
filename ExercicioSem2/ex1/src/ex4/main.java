/*Crie uma porta, abra e feche a mesma, pinte-a de diversas cores,
altere suas dimensões e use o método estaAberta para verificar se ela está aberta.*/
package ex4;
/* @author Luam */
public class main {
     public static void main(String[] args) {
        Porta porta = new Porta();
        porta.cor = "vermelha";
        porta.altura = 2.10f;
        porta.largura = 0.80f;
        
        porta.imprimir();
        porta.estaAberta();
        
        porta.cor = "preta";
        porta.altura = 2.20f;
        porta.largura = 0.90f;
        porta.estado = false;
        
        porta.imprimir();
        porta.estaAberta();
    }
}
