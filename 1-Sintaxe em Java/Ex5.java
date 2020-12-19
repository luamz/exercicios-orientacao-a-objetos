/* Exercício 5: Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
se x é par, x = x / 2; se x é impar, x = 3 * x + 1; imprime x ;O programa deve parar quando x tiver o valor final de 1 */
/* @author Luam */

import java.util.Scanner;
public class Ex5 {
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = teclado.nextInt();
        
        while (x != 1){
            if (x%2 == 0){
                x = x / 2;
            }
            else{
                x = 3 * x + 1;
            }
            System.out.println(x);
        }
     }
}
