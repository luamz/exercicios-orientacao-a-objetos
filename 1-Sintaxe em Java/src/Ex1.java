/* Exercício 1: Imprima a soma de 1 até 1000 */
/* @author Luam */

class Ex1 {
    public static void main(String[] args){            
        int soma = 0;
        for (int num = 1; num <= 1000; num++){
            soma += num;
        }
        System.out.println("A soma de 1 até 1000 é igual a:"+soma);
    }
}
