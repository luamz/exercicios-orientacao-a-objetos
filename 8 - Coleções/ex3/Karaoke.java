package br.uff.ic.poo.ex3;

import java.util.ArrayList;

/* @author Luam */

public class Karaoke {
   ArrayList<Musica> playlist =  new ArrayList();
   
   public ArrayList<Musica> ordenarPorArtista(){
       this.playlist.sort(new ArtistaSorter());
       return playlist;
   }
   public ArrayList<Musica> ordenarPorMusica(){
       this.playlist.sort(new MusicaSorter());
       return playlist;
   }
   
   public void iniciarPlaylist(){
       for(Musica musica :this.playlist){
           System.out.println(musica.titulo + " - " + musica.artista);
           musica.reproduzirMusica();
           System.out.println("----------------------------------------------------");
       }
   }
   
   public void imprimirPlaylist(){
       for (Musica musica: this.playlist){
           System.out.println(musica.titulo + " - " + musica.artista);
       }
   }
   
   
}

