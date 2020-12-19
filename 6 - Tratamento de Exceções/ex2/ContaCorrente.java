package br.uff.ic.poo.ex2;

/* @author Luam */

public class ContaCorrente {
    float limite;
    float saldo;
    float valorLimite;

    public ContaCorrente(float saldo, float limite, float valorLimite) {
        this.limite = limite;
        this.saldo = saldo;
        this.valorLimite = valorLimite;
    }
    
    public void sacar(float valor){
        if (valor<0){
            throw new  IllegalArgumentException("Não é possível sacar um valor negativo.\n");
        }
        else if (valor > this.saldo){
            throw new  IllegalArgumentException("Seu saldo é insuficiente para sacar R$"+valor+"\n");
        }
        else
            this.saldo = saldo - valor;
            System.out.printf("R$%.2f foram sacados da sua conta!\n", valor);
    }
    
    public void depositar(float valor){
        if (valor<0){
            throw new  IllegalArgumentException("Não é possível depositar um valor negativo.\n");
        }
        else{
            this.saldo += valor;
            System.out.printf("R$%.2f foram depositados da sua conta!\n", valor);
        }
    
    }
    
    public void setValorLimite(float valor){
        if (valor<0){
            throw new  IllegalArgumentException("Não é possível ter um limite negativo.\n");
        }
        else{
            this.valorLimite = valor;
            System.out.printf("O limite da sua conta foi mudado para R$%.2f!\n", valor);
        }
    }
}
