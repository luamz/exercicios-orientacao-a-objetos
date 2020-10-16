package br.uff.ic.poo.ex1e2;
/*@author Luam */

public class ConversaoDeUnidadesDeArea {
    public float num;
    public String unidade;

    public ConversaoDeUnidadesDeArea(float num, String unidade) {
        this.num = num;
        this.unidade = unidade;
    }
    
    public static final float M2 = 10.76f;
    public static final float PE2 = 929;
    public static final float MI2 = 640;
    public static final float AC2 = 43.560f;
    public static final float M2_AC2 = 0.000247105f;
    
    public void m_pe(){
        System.out.printf("%.2f metros² que equivalem a ", num);
        num = num*M2;
        System.out.printf("%.2f pes\n", num);
    }
    
    public void pe_cm(){
        System.out.printf("%.2f pes que equivalem a ", num);
        num = num*PE2;
        System.out.printf("%.2f cm²\n", num);
    }
    
    public void mi_ac(){
        System.out.printf("%.2f milhas que equivalem a ", num);
        num = num*MI2;
        System.out.printf("%.2f acres\n", num);
    }
    
    public void ac_pe(){
        System.out.printf("%.2f acres que equivalem a ", num);
        num = num*AC2;
        System.out.printf("%.2f pes\n", num);
    }
    
     public void m_ac(){
        System.out.printf("%.2f metros² que equivalem a ", num);
        num = num*M2_AC2;
        System.out.printf("%.2f acres\n", num);
    }
}
