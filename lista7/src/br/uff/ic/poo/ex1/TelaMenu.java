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
                "5 - Listar cliente"
                );
        
    }
    
    public static void main (String[] args) throws ClienteInexistenteException, RepositorioException{
        Cliente a = new Cliente ("Angela","12345678210");
        
        try{
            CadastroCliente.inserirCliente(a); 
        }
        catch(ClienteJaExistenteException | RepositorioException e1){
            System.out.println(e1.getMessage());
        }
        
        Scanner teclado = new Scanner(System.in);
        TelaMenu.criaMenu();


        int op = teclado.nextInt();
        switch(op) {
            case 1:
            {
                try {
                    CadastroCliente.inserirCliente(a);
                } catch (ClienteJaExistenteException ex) {
                    Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
              break;
            case 2:
              CadastroCliente.buscarClienteNome(a.getNome());
              break;
            case 3:
              ClienteArquivo.buscarPorCPF(a.getCpf());
              break;
            case 4:
              ClienteArquivo.excluir(a.getCpf());
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
