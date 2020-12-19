package br.uff.ic.poo.ex3;
/* @author Luam */

public class Escola extends Construcao{

    int nSalas;

    public Escola(int nPessoas, int nLampadas,int nSalas, boolean arCondicionado, boolean energiaRenovavel) {
        super(nPessoas, nLampadas, arCondicionado, energiaRenovavel);
        this.nSalas = nSalas;
    }
    
    @Override
     public void getCarbonFootprint() {totalkWh = (nPessoas *  50f); //Gasto Médio de aluno por mês
        totalkWh = totalkWh + (nSalas * nLampadas) * 3.5f; // Gasto Médio de uma sala por mês
        if (arCondicionado){
            totalkWh = totalkWh + (100*nSalas);
        }
        
        if (energiaRenovavel){
            totalkWh = totalkWh - 100;
        }
        
        total = totalkWh* 0.5f; // Média de pegadas por kWh
        
        if (!arCondicionado&&!energiaRenovavel){
            System.out.printf("Uma escola com %d alunos e %d salas emite %.2fkg de pegadas de  por mês.\n", nPessoas, nSalas, total );
        }
        
        else if (arCondicionado&&!energiaRenovavel){
            System.out.printf("Uma escola com %d alunos e %d salas, com ar condicionado, emite %.2fkg de pegadas de  por mês.\n", nPessoas, nSalas, total );
        }
        
        else if (!arCondicionado&&energiaRenovavel){
            System.out.printf("Uma escola com %d alunos e %d salas, com renovacao de energia, emite %.2fkg de pegadas de  por mês.\n", nPessoas, nSalas, total );
        }
        
        else if (arCondicionado&&energiaRenovavel){
            System.out.printf("Uma escola com %d alunos e %d salas, com ar condicionado e renovacao de energia, emite %.2fkg de pegadas de  por mês.\n", nPessoas, nSalas, total );
        }}
}
