package br.uff.poo.ic.ex3;

public class Musica {
    protected String titulo;
    protected String artista;
    protected String[] letra;

    public Musica(String titulo, String artista, String[] letra) {
        this.titulo = titulo;
        this.artista = artista;
        this.letra = letra;
    }

    
    public void reproduzirMusica(){
        for(String estrofe: this.letra){
            System.out.println(estrofe);
        }
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String[] getLetra() {
        return letra;
    }

    public void setLetra(String[] letra) {
        this.letra = letra;
    }
    
    
}
