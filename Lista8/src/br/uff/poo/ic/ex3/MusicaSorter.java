package br.uff.poo.ic.ex3;

import java.util.Comparator;
/*@author Luam */

public class MusicaSorter implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}  

