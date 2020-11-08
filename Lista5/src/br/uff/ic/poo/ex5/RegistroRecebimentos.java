package br.uff.ic.poo.ex5;
import java.util.ArrayList;
import java.util.Scanner;

/*@author Luam */

public class RegistroRecebimentos {
    public static void main(String[] args) {
        System.out.print("Controle de Registros\n");
        
        Scanner teclado = new Scanner(System.in);
        int op = 0;

        ItemVenda mouse = new ItemVenda("Mouse", 20, 20);
        ItemVenda cabo = new ItemVenda("Cabo", 30, 2);
        Servico  conserto = new Servico ("Conserto de computador", 2, 50);
        Servico  limpeza = new Servico ("Limpeza de Computador", 1, 20);
        
        ArrayList <Recebivel> registros = new ArrayList<Recebivel>();
        registros.add(mouse);
        registros.add(cabo);
        registros.add(conserto);
        registros.add(limpeza);
        
        while (op!=3){
            System.out.print("\n(1) Adicionar um novo Registro\n(2)Imprimir registros\n(3)Sair\n");
            
            op = teclado.nextInt();
            teclado.nextLine();
            if (op==1){
               System.out.print("Escolha o tipo:\n(1)Serviço\n(2)Venda\n");
               op = teclado.nextInt();
               teclado.nextLine();
               if (op==1){
                   Servico novo = new Servico();
                   System.out.print("Digite o nome do servico: ");
                   novo.descricao = teclado.nextLine();
                   System.out.print("Digite a quantidade de horas do servico: ");
                   novo.horas = teclado.nextInt();
                   teclado.nextLine();
                   System.out.print("Digite o preco por hora: ");
                   novo.precoHora = teclado.nextDouble();
                   teclado.nextLine();
                   registros.add(novo);
               }
                else if (op==2){
                   ItemVenda novo = new ItemVenda();
                   System.out.println("Digite o nome do produto: ");
                   novo.produto = teclado.nextLine();
                   System.out.println("Digite a quantidade: ");
                   novo.quantidade = teclado.nextInt();
                   System.out.println("Digite o preco: ");
                   novo.precoUnitario = teclado.nextDouble();
                   registros.add(novo);
               }
            }
            else  if (op==2){
                for (Recebivel registro : registros ){
                    registro.totalizarReceita();
                }
            }  
        }
    }
}
