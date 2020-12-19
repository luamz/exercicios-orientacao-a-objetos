package br.uff.ic.poo.ex5;
/* @author Luam */

public class Pf extends Contato{
    public String nascimento;

    public Pf(String nome, int codCadastro, String endereco, String nascimento) {
        super(nome, codCadastro, endereco);
        this.nascimento = nascimento;
    }
    
    @Override
    void imprimirContato(){
        System.out.printf("Nome:%s CPF:%d Data de Nascimento:%s Endereço:%s\n", this.nome, this.codCadastro, this.nascimento,this.endereco);
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodCadastro() {
        return codCadastro;
    }

    public void setCodCadastro(int codCadastro) {
        this.codCadastro = codCadastro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
