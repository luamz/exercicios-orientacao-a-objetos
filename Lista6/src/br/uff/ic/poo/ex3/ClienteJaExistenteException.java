package br.uff.ic.poo.ex3;
/* @author Luam */

public class ClienteJaExistenteException extends Exception{
    public ClienteJaExistenteException(){
        super("Cliente já existente");
    }
    
}
