package br.uff.ic.poo.ex3;
/* @author Luam */

public class Teste {
    public static void main(String[] args){
        Cliente a = new Cliente();

        // Testando Exceções de Dado Invalido
        try{
            a.setNome("");
        }
        catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
            try{
                a.setCpf("");
            }
            catch(DadoInvalidoException e2){
                System.out.println(e2.getMessage());
            }
        }
        
        
        // Testando Exceções de Cliente
        Cliente b = new Cliente ("Mateus","12345678910");
        Cliente c = new Cliente ("Ian","12345678911");
        Cliente d = new Cliente ("Paula","12345678912");
      
        CadastroCliente rep = new CadastroCliente();
        try{
            rep.inserirCliente(b);
            rep.inserirCliente(c);
            rep.inserirCliente(b);
        }
        catch(ClienteJaExistenteException | RepositorioException e1){
            System.out.println(e1.getMessage());
        }
        
        try{
            rep.buscarCliente(b);
            rep.buscarCliente(d);
        }
        catch(ClienteInexistenteException e3){
            System.out.println(e3.getMessage());
        }
    }
}
