/* Exercício 6:  Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene cada vetor individualmente,
e combine os dois vetores gerando um novo vetor de 100 posições, de forma que esse novo vetor já seja criado ordenado.  */
/* @author Luam */

import java.util.Random;
public class Ex6 {
    public static void main(String[] args){
        /* Criação dos vetores */
        Random aleatorio = new Random();
        
         int vet1[] = new int[50];
         int vet2[] = new int[50];
         
         for (int i=0; i<50; i++) {
             vet1[i] = aleatorio.nextInt(100);
             vet2[i]= aleatorio.nextInt(100);
         }
         
         System.out.println("Vetor 1:");
         System.out.println(java.util.Arrays.toString(vet1));
         System.out.println("Vetor 2:");
         System.out.println(java.util.Arrays.toString(vet2));
       
        /* Ordenação dos Vetores */
        int aux;
        for(int i = 0; i<50; i++){
		for(int j = 0; j<49; j++){
			if(vet1[j] > vet1[j + 1]){
				aux = vet1[j];
				vet1[j] = vet1[j+1];
				vet1[j+1] = aux;
			}
		}
	}
      
         for(int i = 0; i<50; i++){
		for(int j = 0; j<49; j++){
			if(vet2[j] > vet2[j + 1]){
				aux = vet2[j];
				vet2[j] = vet2[j+1];
				vet2[j+1] = aux;
			}
		}
	}
        
        System.out.println("Vetor 1 ordenado:");
        System.out.println(java.util.Arrays.toString(vet1));
        System.out.println("Vetor 2 ordenado:");
        System.out.println(java.util.Arrays.toString(vet2));    
        
        
    /*Juntando os dois vetores ordenadamente*/
        int vet3[] = new int[100];
        int p=0, q=0, aux2=0;
        while (p<50 && q<50){ 
            if (vet1[p] < vet2[q]){ 
                vet3[aux2++] = vet1[p++];
            }
            else{
                vet3[aux2++] = vet2[q++];   
            }
        }
        while (p < 50){
            vet3[aux2++] = vet1[p++];
        }
        while (q < 50){ 
            vet3[aux2++] = vet2[q++]; 
        }
        
        System.out.println("Vetor 3 ordenado:");
        System.out.println(java.util.Arrays.toString(vet3));             
    }
}

      


