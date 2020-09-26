package ex7;
/* @author Luam */

public class Item {
    Produto produto;
    int quantidade;
    
   float subtotal(){
       float subtotal = produto.preco*quantidade;
       return subtotal;
   }
}
