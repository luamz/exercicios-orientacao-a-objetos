package br.uff.ic.poo.ex1;
/* @author Luam */

public class Cliente {
    protected String nome;
    protected String cpf;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        if (nome.isEmpty())
            throw new DadoInvalidoException("Nome invalido");
        else{
            this.nome = nome;
        }
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws DadoInvalidoException {
        if (cpf.isEmpty())
            throw new DadoInvalidoException("CPF invalido");
        else{
            this.cpf = cpf;
        }   
    }  
}
