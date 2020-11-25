package br.uff.ic.poo.ex1;
/* @author Luam */

public class ClienteJaExistenteException extends Exception{
    public ClienteJaExistenteException(){
        super("Cliente já existente");
    }
    
}
