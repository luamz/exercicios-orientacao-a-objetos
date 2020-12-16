/* Exercício 3: Escreva um programa que solicite ao usuário um número inteiro e imprima o fatorial desse número */
/* @author Luam */

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n;
        n = teclado.nextInt();
        
        int fat = 1;
        for (int i = n; i > 0; i--){
            fat=fat*i;
        }
        System.out.println(n + "! = " + fat);        
    }
}
