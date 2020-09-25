/* Exercício 2: Imprima todos os múltiplos de 3, entre 1 e 100 */
/* @author Luam */

class Ex2 {
    public static void main(String[] args){
        int cont = 0;
        int num = 0;
        System.out.println("Múltiplos de 3 entre 1 e 100:");
        while (num < 100){
            System.out.println(num);
            cont++;
            num = 3 * cont;
        }
    }
}
