package ex2;
/* @author Luam */
public class Sistema {
    public static void main(String[] args) {  
        Aluno aluno = new Aluno("Luam",218010);
        Turma turma = new Turma("B1","Seg e Qua", "18h");
        Professor prof = new Professor("Vania", 145012);
        Disciplina disc = new Disciplina("Programacao Orientada a Objetos");
        
        Inscricao nova = new Inscricao(aluno, disc, turma, prof); 
        
        aluno.geraHistorico();
        aluno.calculaMedia();
        aluno.calculaCr();
        turma.getHorario();
        disc.getEmenta();

    }
}
