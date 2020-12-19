package br.uff.ic.poo.ex6;
/* @author Luam */
public class DiaDaSemana {
    private DiaSemana dia;
    
    public enum DiaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }

    public DiaSemana getDia() {
        return dia;
    }
    
    public boolean ehDiaUtil(){
        return (this.getDia()!=DiaSemana.DOMINGO) && (this.getDia()!=DiaSemana.SABADO);
    }
}
