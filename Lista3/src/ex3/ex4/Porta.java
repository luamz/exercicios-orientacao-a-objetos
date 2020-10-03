package ex3.ex4;
/*@author Luam */

public class Porta {
    String cor;
    float altura;
    float largura;
    boolean estado = true;

    public Porta(String cor, float altura, float largura) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }
    
    
    void estaAberta(){
        if (estado)
            System.out.println("A porta está aberta!\n");
        else
            System.out.println("A porta está fechada!\n");
    }
    
    void imprimir(){
       System.out.printf("Porta %s %.2fx%.2f\n", cor, altura, largura);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
