package br.uff.ic.poo.ex5;
/* @author Luam */

public class Pj extends Contato{
    public float faturamento;

    public Pj(String nome, int codCadastro, String endereco, float faturamento) {
        super(nome,codCadastro, endereco);
        this.faturamento = faturamento;
    }
    
    @Override
    void imprimirContato(){
        System.out.printf("Nome:%s CNPJ:%d Faturamento:%s Endereço:%s\n", this.nome, this.codCadastro, this.faturamento,this.endereco);
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
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
