package br.uff.ic.poo.ex1;

import java.util.ArrayList;

/* @author Luam */

public class Main {
    /*  A execção "IllegalArgumentException" é usada para indicar que um argumento
    passado a um método é ilegal ou inapropriado*/
    
    /*  A execção "NumberFormatException." é usada quando se tenta converter
    uma string em um tipo númerico, porém a String não tem formato correto */
 
    /*Exemplo*/
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        int a = 5;
        String b = "5";
        String c = "Cinco";
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        
        for (Object n : lista) {
            try{
                System.out.printf("%d\n", n);
            }
            catch(IllegalArgumentException ex1){
                   try{
                        int i = Integer.valueOf((String) n);
                        System.out.printf("%d (String convertida para int)\n",i);
                    }
                    catch (NumberFormatException ex2){
                        System.out.printf("Problemas com a conversão da string '%s' para número\n", n);
                    }
            }
        }
    }
}
