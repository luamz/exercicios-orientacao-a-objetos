package br.uff.ic.poo.ex2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/* @author Luam */

/* Porque cada Collection tem algoritmos diferentes de inserção/construtor,
   seja de acordo com a ordem inicial, crescente/descrescente, lexicográfica,
   espaço de memória, e etc.
   Quando convertemos de um tipo para outro, é normal que a ordem mude.
*/


public class Main {
    public static void main(String[] args) 
    { 
        ArrayList<String> palavras = new ArrayList<>(Arrays.asList("A", "Capitu","nao", "traiu", "o", "Bentinho" ));
        System.out.println(palavras.toString());
        
        Set<String> palavras2 = new HashSet<>(palavras);
        System.out.println(palavras2.toString());
        
        PriorityQueue palavras3 = new PriorityQueue(palavras2);
        System.out.println(palavras3.toString());
        
        ArrayDeque<String> palavras4 = new ArrayDeque<>(palavras3);
        System.out.println(palavras4.toString());
        
        TreeSet palavras5 =new TreeSet(palavras4);
        System.out.println(palavras5.toString());
        
    }
}

