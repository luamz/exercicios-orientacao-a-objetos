package br.uff.ic.poo.ex3;

import java.util.Comparator;
/*@author Luam */

public class ArtistaSorter implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return o1.getArtista().compareTo(o2.getArtista());
    }
}  

