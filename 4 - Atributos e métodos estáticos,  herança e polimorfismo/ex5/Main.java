/*Faça um programa de agenda que permita guardar dois tipos de contato: pessoa física e pessoa jurídica. 
Para pessoa física, guarde o nome, o CPF, o endereço e a data de aniversário. 
Para pessoa jurídica, guarde a razão social, o CNPJ, o endereço e o faturamento. 
Permita tanto listar todos os contatos da agenda quanto buscar um contato específico pelo seu CPF,
se for pessoa física, ou pelo CNPJ, se for pessoa jurídica. Use herança e polimorfismo.
*/

package br.uff.ic.poo.ex5;
/*@author Luam */

public class Main {
    public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Pj hogwarts = new Pj("Escola de Magia e Bruxaria de Hogwarts", 934, " Secreto", 100000);
    Pf harry = new Pf("Harry Potter", 123 , "Rua dos Alfeneiros, 4", "31/07/1980");
    agenda.addContato(hogwarts);
    agenda.addContato(harry);
    
    agenda.buscarContato(934);
    
    agenda.imprimirTodos();
    
  
    }
}
