package br.uff.ic.poo.ex2;
/* @author Luam */

public class Construcao implements CarbonFootprint{
    int nPessoas;
    int nLampadas;
    boolean arCondicionado;
    boolean energiaRenovavel;
    float totalkWh, total;

    public Construcao(int nPessoas, int nLampadas, boolean arCondicionado, boolean energiaRenovavel) {
        this.nPessoas = nPessoas;
        this.nLampadas = nLampadas;
        this.arCondicionado = arCondicionado;
        this.energiaRenovavel = energiaRenovavel;
    }
   
    @Override
    public void getCarbonFootprint() {
        totalkWh = (nPessoas *  152.2f); //Gasto Médio de 1 pessoa por mês
        totalkWh = totalkWh + nLampadas * 3.5f; // Gasto Médio de uma lâmpada por mês
        if (arCondicionado){
            totalkWh = totalkWh + 100;
        }
        
        if (energiaRenovavel){
            totalkWh = totalkWh - 100;
        }
        
        total = totalkWh* 0.5f; // Média de pegadas por kWh
        
        if (!arCondicionado&&!energiaRenovavel){
            System.out.printf("Um residência com %d pessoas, emite %.2fkg de pegadas de  por mês.\n", nPessoas, total );
        }
        
        else if (arCondicionado&&!energiaRenovavel){
            System.out.printf("Um residência com %d pessoas, com ar condicionado, emite %.2fkg de pegadas de  por mês.\n", nPessoas, total );
        }
        
        else if (!arCondicionado&&energiaRenovavel){
            System.out.printf("Um residência com %d pessoas, com renovacao de energia, emite %.2fkg de pegadas de  por mês.\n", nPessoas, total );
        }
        
        else if (arCondicionado&&energiaRenovavel){
            System.out.printf("Um residência com %d pessoas, com ar condicionado e renovacao de energia, emite %.2fkg de pegadas de  por mês.\n", nPessoas, total );
        }
        
    }
}
