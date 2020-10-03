package ex3.ex6;
/* @author Luam */

public class Lamp {
    String estado;

    public Lamp(String estado) {
        this.estado = estado;
    }
    
    boolean estaLigada(){
        return "Ligada".equals(estado);
    }
}
