package br.uff.ic.poo.ex5;
/* @author Luam */

public class ItemVenda implements Recebivel{
    String produto;
    int quantidade;
    double precoUnitario;
    
    public ItemVenda (){}

    public ItemVenda(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public void totalizarReceita() {
        System.out.printf("Produto: %s - Vendindos: R$%.2f (%dun)\n", produto, quantidade*precoUnitario, quantidade);
    }
}
