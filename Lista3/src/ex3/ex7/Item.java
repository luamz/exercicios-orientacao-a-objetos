package ex3.ex7;
/* @author Luam */

public class Item {
    Produto produto;
    int quantidade;
    
   float subtotal(){
       float subtotal = produto.preco*quantidade;
       return subtotal;
   }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
}
