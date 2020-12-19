/*1 - Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão 
das unidades de área segundo a lista abaixo.
1 metro quadrado = 10.76 pés quadrados; 1 pé quadrado = 929 centímetros quadrados
1 milha quadrada = 640 acres; 1 acre = 43.560 pés quadrados 

2 - A área de um campo de futebol é de 8.250 metros quadrados.
Usando a classe ConversaoDeUnidadesDeArea, escreva um programa em Java que mostre
qual é a área de um campo de futebol em pés quadrados, acres ecentímetros quadrados.
Escreva métodos adicionais para a classe  ConversaoDeUnidadesDeArea, se necessário.
 */
package br.uff.ic.poo.ex1e2;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
        System.out.println("O campo de futebol tem 8250.00 metros²");
        ConversaoDeUnidadesDeArea campoFutebol = new ConversaoDeUnidadesDeArea(8250, "m");
        campoFutebol.m_ac();
        campoFutebol.ac_pe();
        campoFutebol.pe_cm();
        
    }
}
