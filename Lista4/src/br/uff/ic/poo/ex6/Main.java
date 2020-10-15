package br.uff.ic.poo.ex6;

/* @author Luam */

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil","Brasilia",8516000);
        Pais uruguai = new Pais("Uruguai","Montevideo",176215);
        Pais argentina = new Pais("Argentina","Buenos Aires", 2780000);
        Pais chile = new Pais("Chile","Santiago",756950);
        
        brasil.setFronteira(argentina);
        brasil.setFronteira(uruguai);
        argentina.setFronteira(brasil);
        argentina.setFronteira(chile);
        argentina.setFronteira(uruguai);
        chile.setFronteira(argentina);
        
        
        
        brasil.getFronteira();
        argentina.getFronteira();
        if (!brasil.equals(chile))
            System.out.println("\nBrasil não faz fronteira com: Chile");
        brasil.fronteirasComuns(argentina);
    }
}
