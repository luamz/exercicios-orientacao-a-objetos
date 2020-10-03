package ex1;
/* @author Luam */

public class Carro {
    private  String placa;
    private String cor;
    private int ano;
    private float preco;
    private String modelo;

    public Carro(String placa, int ano, String modelo, int preco) {
       this.placa = placa;
       this.modelo = modelo;
       this.ano = ano;
       this.preco=preco;
    }

    public Carro(String placa, int ano, String modelo, String cor) {
       this.placa = placa;
       this.modelo = modelo;
       this.ano = ano;
       this.cor=cor;
    }

    public Carro(String placa, int ano, String modelo) {
      this.placa = placa;
       this.modelo = modelo;
       this.ano = ano;  
    }
    
    

    public void gerarImposto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gerarOrcamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void vender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void alugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
