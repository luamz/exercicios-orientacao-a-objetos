package br.uff.ic.poo.ex3;
import java.util.Scanner;

/* @author Luam */

public class Main {
    public static void main(String[] args) { 
        String[] letra= {"I've been cheated by you since I don't know when\n",
                        "So I made up my mind, it must come to an end\n",
                        "Look at me now, will I ever learn\n",
                        "I don't know how but I suddenly lose control\n",
                        "There's a fire within my soul\n",
                        "Just one look and I can hear a bell ring\n",
                        "One more look and I forget everything\n",
                        "Mamma mia, here I go again\n",
                        "My my, how can I resist you\n",
                        "Mamma mia, does it show again\n",
                        "My my, just how much I've missed you"};
        Musica m1 = new Musica("Mamma mia", "Abba", letra);
        
        String[] letra2= {"Golden, golden, golden\n" ,
                        "As I open my eyes\n" ,
                        "Hold it, focus, hoping\n" ,
                        "Take me back to the light\n" ,
                        "I know you were way too bright for me\n" ,
                        "I'm hopeless, broken\n" ,
                        "So you wait for me in the sky\n" ,
                        "Browns my skin just right"};
        Musica m2 = new Musica("Golden", "Harry Styles", letra2);
    
        
         String[] letra3= {"Lança menina\n" ,
                            "Lança todo esse perfume\n" ,
                            "Desbaratina\n" ,
                            "Não dá pra ficar imune\n" ,
                            "Ao teu amor\n" ,
                            "Que tem cheiro\n" ,
                            "De coisa maluca"};
        Musica m3 = new Musica("Lança Perfume", "Rita Lee", letra3);
        
        Karaoke karaoke = new Karaoke();
        karaoke.playlist.add(m2);
        karaoke.playlist.add(m1);
        karaoke.playlist.add(m3);
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("------ Karaoke ------\n" +
                "Escolha uma operação para prosseguir: \n"+
                "1 - Listar músicas por artista\n" +
                "2 - Listar músicas por título\n" +
                "3 - Reproduzir por ordem de artista\n" +
                "4 - Reproduzir por ordem de titulo\n"
                );
        
        int op = teclado.nextInt();
        switch(op) {
            case 1:
            {
                karaoke.ordenarPorArtista();
                karaoke.imprimirPlaylist();
            }break;
            case 2:{
                karaoke.ordenarPorMusica();
                karaoke.imprimirPlaylist();
                
            }break;
            case 3:{
                karaoke.ordenarPorArtista();
                karaoke.iniciarPlaylist();
            }break;
            case 4:{
                karaoke.ordenarPorMusica();
                karaoke.iniciarPlaylist();
            }break;
            
        }
        
        
        
        
    }
}

