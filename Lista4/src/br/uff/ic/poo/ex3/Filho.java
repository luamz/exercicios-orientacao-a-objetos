package br.uff.ic.poo.ex3;
/* @author Luam */

public class Filho extends Pessoa {
    private Pessoa pai;
    private Pessoa mae;

    public Filho(String nome, int idade) {
        super(nome, idade);
    }

    public Filho(String nome, int idade, Pessoa pai, Pessoa mae) {
        super(nome, idade);
        this.mae=mae;
        this.pai=pai;
    }
    
    public void imprimirPais(){
    System.out.printf("%s tem %d anos, ele(a) eh filho(a) de %s e %s\n",
            this.nome, this.idade, this.pai.nome, this.mae.nome);
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }    
}
