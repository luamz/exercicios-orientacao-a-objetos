package br.uff.ic.poo.ex1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Luam */

public class TelaMenu {
    
    public static void criaMenu(){
        System.out.println("Registro de Clientes\n"+
                "Escolha uma operação para prosseguir: \n"+
                "1 - Cadastrar novo cliente\n" +
                "2 - Buscar cliente pelo nome\n" +
                "3 - Buscar cliente pelo CPF\n" +
                "4 - Excluir cliente\n" +
                "5 - Listar clientes"
                );
        
    }
    
    public static void main (String[] args) throws ClienteInexistenteException, RepositorioException{

        Scanner teclado = new Scanner(System.in);
        TelaMenu.criaMenu();


        int op = teclado.nextInt();
        teclado.nextLine();
        switch(op) {
            case 1:
            {
                try {
                    System.out.println("Digite o nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite o cpf: ");
                    String cpf = teclado.nextLine();
                    CadastroCliente.inserirCliente(new Cliente (nome, cpf));
                    System.out.println("O cliente foi inserido no sistema!!");
                } catch (ClienteJaExistenteException ex) {
                    ex.getMessage();
                }
            }
              break;
            case 2:
              System.out.println("Digite o nome: ");
              String nome = teclado.nextLine();
              CadastroCliente.buscarClienteNome(nome);
              break;
            case 3:
              System.out.println("Digite o cpf: ");
              String cpf = teclado.nextLine();
              CadastroCliente.buscarCPF(cpf);
              break;
            case 4:
              System.out.println("Digite o cpf: ");
              String cpf2 = teclado.nextLine();
              CadastroCliente.removerCliente(cpf2);
              break;
            case 5:
              ArrayList<Cliente> lista =  ClienteArquivo.listar();
              for(Cliente item : lista){
                  System.out.println(item.nome + " " + item.cpf);
              }
              break;
            default:
            System.out.println("Erro!");
        }
    }
}
