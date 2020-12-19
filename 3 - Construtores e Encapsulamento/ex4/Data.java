package ex4;
/* @author Luam */

public class Data {
    private int dia;
    private int mesI;
    private String mesS;
    private int ano;
    
    Data(int dia, int mes, int ano){
        this.dia=dia;
        this.mesI=mes;
        this.ano=ano;
    }
    
    Data(String mes, int dia, int ano){
        this.dia=dia;
        this.mesS=mes;
        this.ano=ano;
    }
    
    Data(int dia, int ano){
        this.dia=dia;
        this.ano=ano;
    }

    void imprimir(int dia, int mes, int ano){
        System.out.printf("A data é: %d/%d/%d\n", this.dia, this.mesI , this.ano);
    }
    
    void imprimir(String mes, int dia, int ano){
        System.out.printf("A data é: %s %d, %d\n", this.mesS, this.dia, this.ano);
    }
    void imprimir(int dia, int ano){
        System.out.printf("A data  é: %d/ %d\n", this.dia,this.ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMesI() {
        return mesI;
    }

    public void setMesI(int mesI) {
        this.mesI = mesI;
    }

    public String getMesS() {
        return mesS;
    }

    public void setMesS(String mesS) {
        this.mesS = mesS;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
       
        
}


