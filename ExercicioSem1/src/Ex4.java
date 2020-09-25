/* Exercício 4:Imprima os primeiros números da série de Fibonacci até passar de 100. */
/* @author Luam */

public class Ex4 {
     public static void main(String[] args){
        int n0 = 0; /*penúltimo*/
        int n1 = 1; /*último*/
        int n2 = 0; /*atual*/
        System.out.println("Sequência de Fibonacci até passar de 100:");
         System.out.print(" " + n0 + " ");
        System.out.print(" " + n1 + " ");
        while (n2 <= 100){
            n2 = n0+n1;
            n0 = n1;
            n1 = n2;
            System.out.print(" " + n2 + " ");
            
        }
     }
}
