package ex4;
/*@author Luam */

public class Porta {
    String cor;
    float altura;
    float largura;
    boolean estado = true;
    
    
    void estaAberta(){
        if (estado)
            System.out.println("A porta está aberta!\n");
        else
            System.out.println("A porta está fechada!\n");
    }
    
    void imprimir(){
       System.out.printf("Porta %s %.2fx%.2f\n", cor, altura, largura);
    }
}
