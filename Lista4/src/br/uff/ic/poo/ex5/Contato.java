package br.uff.ic.poo.ex5;
/* @author Luam */

public class Contato {
    protected String nome;
    protected int codCadastro;
    protected String endereco;

    public Contato(String nome, int codCadastro, String endereco) {
        this.nome = nome;
        this.codCadastro = codCadastro;
        this.endereco = endereco;
    }
    
void imprimirContato(){
        System.out.printf("%s, %d, %s", this.nome, this.codCadastro, this.endereco);
    }
}

