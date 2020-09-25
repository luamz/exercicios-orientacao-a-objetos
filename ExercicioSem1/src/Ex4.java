/* Exercício 4:Imprima os primeiros números da série de Fibonacci até passar de 100. */
/* @author Luam */

public class Ex4 {
     public static void main(String[] args){
        int n0 = 0;
        int n1 = 1;
        int n = 0;
        System.out.println("Sequência de Fibonacci até passar de 100:");
        System.out.println(n0);
        System.out.println(n1);
        while (n <= 100){
            n = n0+n1;
            n0 = n1;
            n1 = n;
            System.out.println(n);
            
        }
     }
}
