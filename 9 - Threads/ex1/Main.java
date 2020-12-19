package br.uff.ic.poo.ex1;

import java.util.Scanner;

/* @author Luam */

public class Main {
     public static void main(String[] args) {
         System.out.print("Digite um numero: ");
         Scanner teclado = new Scanner(System.in);
         int n = teclado.nextInt();
         
         ThreadPrimos t = new ThreadPrimos(n);

     
     }
}
