/*Identifique e implemente as classes em Java para a seguinte especificação:
O supermercado vende diferentes tipos de produtos.
Cada produto tem um preço e uma quantidade em estoque.
Um pedido de um cliente é composto de itens, onde cada item especifica
o produto que o cliente deseja e a respectiva quantidade. 
Esse pedido pode ser pago em dinheiro, cheque ou cartão.
*/
package ex3.ex7;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
       
        
        Produto leite = new Produto("Leite", 2.99f, 20);
        Produto arroz = new Produto("Arroz", 12.99f, 100);
        Produto pao = new Produto("Pão", 0.25f, 50);
               
        Pedido pedido1 = new Pedido(230612);
        
        pedido1.addItem(pao, 1000);
        pedido1.addItem(arroz, 1);
        pedido1.addItem(leite, 2);
        
        Caixa caixa1 =  new Caixa("Alan Turing", pedido1, "Cartão de Débito");
        caixa1.imprimirPedido();
        
    }
}
