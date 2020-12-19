package br.uff.ic.poo.ex1;

import java.util.HashMap;

/* @author Luam */

public class Main {
    public static void main(String[] args) 
    { 
        String frase = "O Pedro tem um pinguim e o pinguim tambem se chama Pedro";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras){
            Integer contador = map.get(palavra);
            if (contador == null) {
                contador = 0;
            }
            map.put(palavra.toLowerCase(), contador + 1);
        }

        System.out.println(frase);
        System.out.println(map);
    }
}

