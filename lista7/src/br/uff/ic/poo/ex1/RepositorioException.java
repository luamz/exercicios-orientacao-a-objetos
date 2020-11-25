package br.uff.ic.poo.ex1;
/* @author Luam */

public class RepositorioException extends Exception {
    public RepositorioException(){
        super("Repositório de clientes lotado!");
    }
}
