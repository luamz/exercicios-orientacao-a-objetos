package br.uff.ic.poo.ex5;
/* @author Luam */

public class Servico implements Recebivel{
    String descricao;
    int horas;
    double precoHora;

    public Servico() {}

    public Servico(String descricao, int horas, double precoHora) {
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }
    
    @Override
    public void totalizarReceita() {
        System.out.printf("Servico: %s - Preco: - R$%.2f\n", descricao, horas*precoHora);
    }
}
