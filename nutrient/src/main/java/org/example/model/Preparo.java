package org.example.model;

public class Preparo {

    private String nome;
    private boolean lowCarb;
    private boolean vegano;
    private boolean semLactose;
    private boolean reduzidoSodio;
    private String modoDeFazer;

    public Preparo(String nome, boolean lowCarb, boolean vegano, boolean semLactose, boolean reduzidoSodio, String modoDeFazer) {
        this.nome = nome;
        this.lowCarb = lowCarb;
        this.vegano = vegano;
        this.semLactose = semLactose;
        this.reduzidoSodio = reduzidoSodio;
        this.modoDeFazer = modoDeFazer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLowCarb() {
        return lowCarb;
    }

    public void setLowCarb(boolean lowCarb) {
        this.lowCarb = lowCarb;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public boolean isSemLactose() {
        return semLactose;
    }

    public void setSemLactose(boolean semLactose) {
        this.semLactose = semLactose;
    }

    public boolean isReduzidoSodio() {
        return reduzidoSodio;
    }

    public void setReduzidoSodio(boolean reduzidoSodio) {
        this.reduzidoSodio = reduzidoSodio;
    }

    public String getModoDeFazer() {
        return modoDeFazer;
    }

    public void setModoDeFazer(String modoDeFazer) {
        this.modoDeFazer = modoDeFazer;
    }
}
