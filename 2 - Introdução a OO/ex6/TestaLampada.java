/* Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
Imagine que essa lâmpada possa ter três estados: apagada, acesa e meia-luz. 
Além disso, ela tem uma operação “estaLigada”
que retorne verdadeiro se a lâmpada estiver ligada e falso, caso contrário.
Crie uma classe TesteLampada que implementa o método TestaLampada com as seguintes operações:
a.Instancie 2 objetos dessa classe.
b.Ligar um dos objetos de Lampada e desligar o outro.
c. Mostrar na tela se as lâmpadas dos objetos estão ligadas ou desligadas
 */
package ex6;

/* @author Luam */
public class TestaLampada {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();
        
        lamp1.estado = true;
        lamp2.estado = false;
        
        if (lamp1.estaLigada())
            System.out.println("A lâmpada 1 está ligada");
        else
            System.out.println("A lâmpada 1 está desligada!");
        
        if (lamp2.estaLigada())
            System.out.println("A lâmpada 2 está ligada");
        else
            System.out.println("A lâmpada 2 está desligada!");
    }
}
