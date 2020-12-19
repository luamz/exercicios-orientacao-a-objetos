package ex3.ex3;
/* @author Luam */

public class Conta {
    protected String nome;
    protected int num;
    protected int agencia;
    protected String dataAbertura;
    protected float saldo;

    public Conta(String nome, int num, int agencia, String dataAbertura, float saldo) {
        this.nome = nome;
        this.num = num;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }
    
    void imprimirConta(){
        System.out.println(nome);
        System.out.printf("Ag:%d  Conta: %d\n", agencia, num);
        System.out.printf("Seu saldo: R$%.2f\n", saldo);
        System.out.println("----------------------------------------");
    }
    
    void sacar(float deb){
        saldo = saldo - deb ;
        System.out.printf("R$%.2f foram sacados!\n", deb);
        System.out.println("----------------------------------------");
    }
    
    void depositar (float cred){
        saldo = saldo + cred;
        System.out.printf("R$%.2f foram depositados!\n", cred);
        System.out.println("----------------------------------------");
    }
    void imprimirRend(){
        System.out.printf("Seu saldo atual é: R$%.2f\n", saldo);
        System.out.printf("Seu rendimento mensal será de: R$%.2f\n", saldo*0.01f);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
