package ex2;

/* @author Luam */
public class Aluno {
    String nome;
    int matricula;
    int notas[] = new int[2];

    Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    void geraHistorico(){
        for (int i=0; i<notas.length; i++){
            System.out.printf("Nota %d: %d", i+1, notas[i]);
        }
    }
    
    void calculaMedia(){
        int media = 0, soma = 0;
        for (int i=0; i<notas.length; i++){
            soma= soma + notas[i];
        }
        media =  soma / notas.length;
    }

    void calculaCr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
