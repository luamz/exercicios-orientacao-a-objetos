package ex5;
/* @author Luam */

public class Casa {
    Porta[] portas = new Porta[10];
    int qtdePortas = 0;
    String cor;
    
    
    void addPortas(Porta p){
        portas[qtdePortas]= p;
        qtdePortas++;
    }
    void quantasAbertas(){
        int s=0;
        for (int i=0; i<qtdePortas; i++){
            if(portas[i].estado) {
                s++;
            }
        }
        System.out.printf("tem %d portas abertas!\n", s);
    }
}
