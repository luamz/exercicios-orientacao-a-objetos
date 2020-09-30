/*Identifique e implemente as classes em Java para a seguinte especificação:
O supermercado vende diferentes tipos de produtos.
Cada produto tem um preço e uma quantidade em estoque.
Um pedido de um cliente é composto de itens, onde cada item especifica
o produto que o cliente deseja e a respectiva quantidade. 
Esse pedido pode ser pago em dinheiro, cheque ou cartão.
*/
package ex7;
/* @author Luam */

public class Main {
    public static void main(String[] args) {
       
        
        Produto leite = new Produto();
        leite.nome = "Leite";
        leite.preco = 2.99f;
        leite.qtdeEstoque = 20;
        
        Produto arroz = new Produto();
        arroz.nome = "Arroz";
        arroz.preco = 12.99f;
        arroz.qtdeEstoque = 100;
        
        Produto pao = new Produto();
        pao.nome = "Pão";
        pao.preco = 0.25f;
        pao.qtdeEstoque = 50;
               
        Pedido pedido1 = new Pedido();
        pedido1.numero = 230612;
        
        pedido1.addItem(pao, 1000);
        pedido1.addItem(arroz, 1);
        pedido1.addItem(leite, 2);
        
        Caixa caixa1 =  new Caixa();
        caixa1.cliente = "Alan Turing";
        caixa1.pedido = pedido1;
        caixa1.pagamento = "Cartão de Débito";
        caixa1.imprimirPedido();
        
    }
}
