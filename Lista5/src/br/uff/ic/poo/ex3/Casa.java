package br.uff.ic.poo.ex3;
/* @author Luam */

public class Casa extends Construcao  {
    
    int nChuveirosEletricos;
    
    public Casa(int nPessoas, int nLampadas, int nChuveirosEletricos, boolean arCondicionado, boolean energiaRenovavel) {
        super(nPessoas, nLampadas, arCondicionado, energiaRenovavel);
        this.nChuveirosEletricos = nChuveirosEletricos;
    }
    
    @Override
     public void getCarbonFootprint() {
        totalkWh = (nPessoas *  152.2f); //Gasto Médio de 1 pessoa por mês
        totalkWh = totalkWh + nLampadas * 3.5f; // Gasto Médio de uma lâmpada por mês
        totalkWh = totalkWh + (nChuveirosEletricos*1000);
        if (arCondicionado){
            totalkWh = totalkWh + 100;
        }
        
        if (energiaRenovavel){
            totalkWh = totalkWh - 100;
        }
        
        total = totalkWh* 0.5f; // Média de pegadas por kWh
        
        if (!arCondicionado&&!energiaRenovavel){
            System.out.printf("Uma casa com %d pessoas e %d chuveiros eléltricos emite %.2fkg de pegadas de  por mês.\n", nPessoas, nChuveirosEletricos, total );
        }
        
        else if (arCondicionado&&!energiaRenovavel){
            System.out.printf("Uma casa com %d pessoas, com ar condicionado e %d chuveiros eléltricos emite %.2fkg de pegadas de  por mês.\n", nPessoas, nChuveirosEletricos, total );
        }
        
        else if (!arCondicionado&&energiaRenovavel){
            System.out.printf("Uma casa com %d pessoas, com renovacao de energia e %d chuveiros eléltricos emite %.2fkg de pegadas de  por mês.\n", nPessoas, nChuveirosEletricos, total );
        }
        
        else if (arCondicionado&&energiaRenovavel){
            System.out.printf("Uma casa com %d pessoas, com ar condicionado, %d chuveiros eléltricos e renovacao de energia, emite %.2fkg de pegadas de  por mês.\n", nPessoas, nChuveirosEletricos, total );
        }   
    }
}
