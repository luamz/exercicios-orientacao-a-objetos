package ex4;
/* @author Luam */

public class Main {
    public static void main(String[] args) {  
        Data d1 = new Data(1,10,2020);
        Data d2 = new Data ("Outubro", 1, 2020);
        Data d3 = new Data (274, 2020);
        
        d1.imprimir(d1.getDia(),d1.getMesI(),d1.getAno());
        d2.imprimir(d2.getMesS(), d2.getDia(), d2.getAno());
        d3.imprimir(d3.getDia(), d3.getAno());
        
        Data d4 = new Data(31,12,2020);
        Data d5 = new Data ("Dezembro", 31, 2020);
        Data d6 = new Data (365, 2020);
        
        d4.imprimir(d1.getDia(),d1.getMesI(),d1.getAno());
        d5.imprimir(d2.getMesS(), d2.getDia(), d2.getAno());
        d6.imprimir(d3.getDia(), d3.getAno());
    }
}
