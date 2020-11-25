package br.uff.ic.poo.ex1;
import java.io.*;
import java.util.ArrayList;

/* @author Luam */

public class ClienteArquivo implements Serializable {
    public static int contador = 0;
   
    public static void inserir(Cliente novo){
        try{
            FileOutputStream arq = new FileOutputStream("clientes.dat");
            
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(novo);
            contador++;
            obj.close();
            
            arq.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        catch(IOException e){
            e.getMessage();
        }
        
    }
    public static Cliente buscarPorCPF (String CPF) throws ClienteInexistenteException{
        Cliente aux = new Cliente();
        try{
            FileInputStream arq = new FileInputStream("clientes.dat");
            
            ObjectInputStream obj = new ObjectInputStream(arq);
            aux = (Cliente)obj.readObject();
            obj.close();
            
            arq.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
        
        
        if (aux.getCpf().equals(CPF)){
               return aux;
        }
        else{
           throw new ClienteInexistenteException();
        }
    }
        
    public static ArrayList<Cliente> buscarPorNome(String nome) throws ClienteInexistenteException{
        ArrayList<Cliente> lista = ClienteArquivo.listar();
        ArrayList<Cliente> achados = new ArrayList<>();
        
        for (Cliente item: lista){
            if (item.nome.equals(nome)){
                achados.add(item);
            }
        }
        
        if (achados.isEmpty()){
            throw new ClienteInexistenteException();
        }
        return achados;
    }
    
    public static ArrayList<Cliente> listar (){
          ArrayList<Cliente> lista = new ArrayList<>();
        try{
            FileInputStream arq = new FileInputStream("clientes.dat");
            
            ObjectInputStream obj = new ObjectInputStream(arq);
            for (int i = 0; i < contador; i++){
                lista.add((Cliente)obj.readObject());
            }
            obj.close();
            
            arq.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
        return lista;
    }
    
    public static void excluir(String CPF){
         ArrayList<Cliente> lista = ClienteArquivo.listar();
         File arq = new File("clientes.dat");
         arq.delete();
         
         for (Cliente item : lista){
             if (!(item.cpf.equals(CPF))){
                 ClienteArquivo.inserir(item);
             }
         }
    }
    
}
    
