package ex3;
/* @author Luam */

public class Conta {
    String nome;
    int num;
    int agencia;
    String dataAbertura;
    float saldo;
    
    void imprimirConta(){
        System.out.println(nome);
        System.out.printf("Ag:%d  Conta: %d\n", agencia, num);
        System.out.printf("Seu saldo: R$%.2f\n", saldo);
    }
    
    void sacar(float deb){
        saldo = saldo - deb ;
        System.out.printf("R$%.2f foram sacados!\n", deb);
    }
    
    void depositar (float cred){
        saldo = saldo + cred;
        System.out.printf("R$%.2f foram depositados!\n", cred);
    }
    void imprimirRend(){
        System.out.printf("Seu rendimento mensal foi: R$%.2f\n", saldo);
    }
}
