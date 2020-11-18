package br.uff.ic.poo.ex3;

import java.util.ArrayList;

/* @author Luam */

public class CadastroCliente {
    ArrayList<Cliente> Clientes = new ArrayList<>(10);
    
    
    public void inserirCliente(Cliente novo) throws RepositorioException, ClienteJaExistenteException{
        if (buscarCPF(novo)){
            throw new ClienteJaExistenteException();
        }
        else if (this.Clientes.size()<10){
            Clientes.add(novo);
        }
        else{
            throw new RepositorioException();
        }
    }
    
    
    public void buscarCliente(Cliente c) throws ClienteInexistenteException{
        boolean b = false;
        for (Cliente cliente : this.Clientes){
            if (cliente.equals(c)){
                b = true;
                System.out.println("O cliente está no repositório");
            }
        }
        
        if(!b){
            throw new ClienteInexistenteException();
        }
        
        
    }
    
    public boolean buscarCPF(Cliente c){
        for (Cliente cliente : this.Clientes){
            if (cliente.cpf.equals(c.cpf)){
                return true;
            }
        }
        return false;
    }

  
}
