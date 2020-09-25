package ex5;
/* @author Luam */

public class Casa {
    Porta[] portas = new Porta[10];
    
    void quantasAbertas(){
        int cont = 0;
        for (int i=0;i<portas.length;i++) {
            if (portas[i].estado) {
                cont++;
            }
        }
        System.out.printf("Temos %d portas abertas!\n", cont);
    }
}
