package br.uff.ic.poo.ex1;
/* @author Luam */

public class ClienteInexistenteException extends Exception{
    public ClienteInexistenteException(){
        super("O cliente não existe.");
    }
}
