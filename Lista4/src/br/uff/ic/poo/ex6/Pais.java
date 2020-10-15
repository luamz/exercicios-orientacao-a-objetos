package br.uff.ic.poo.ex6;
import java.util.ArrayList;

/* @author Luam */

public class Pais {
    private String nome;
    private String capital;
    private float area;
    private ArrayList<Pais> fronteiras = new ArrayList<>();
    private ArrayList<Pais> comuns = new ArrayList<>();

    public Pais(String nome, String capital, float area) {
        this.nome = nome;
        this.capital = capital;
        this.area = area;
    }
    
    public boolean equals(Pais outro){
        return this.nome.equals(outro.nome)&&this.capital.equals(outro.capital);
    }
    
    public void setFronteira(Pais outro){
        if (!this.equals(outro))
            this.fronteiras.add(outro);
    }
    
    public void getFronteira(){
        System.out.printf("\n%s faz fronteira com: ", this.nome);
        for (Pais p : fronteiras){
            System.out.printf("%s ", p.nome);
        }
    }
     
    public ArrayList<Pais> fronteirasComuns(Pais outro){
        System.out.printf("\nAs fronteiras em comum entre %s e %s são: ", this.nome, outro.nome);
        for (Pais p : fronteiras) {
            if(outro.fronteiras.contains(p)) {
                 System.out.printf("%s ", p.nome);
                comuns.add(p);
            }
        }
         return comuns;

    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
}
