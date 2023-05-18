package org.example.builder;

import org.example.model.Alimento;
import org.example.model.Nutriente;
import org.example.model.Preparo;

import java.util.List;

public class PreparoContreteBuilder implements PreparoBuilder{

    private String nome;
    private boolean lowCarb;
    private boolean vegano;
    private boolean semLactose;
    private boolean semGluten;
    private boolean reduzidoSodio;
    private String modo;
    private List<Alimento> alimentos;
    @Override
    public PreparoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PreparoBuilder setLowCarb(boolean lowCarb) {
        this.lowCarb = lowCarb;
        return this;
    }

    @Override
    public PreparoBuilder setVegano(boolean vegano) {
        this.vegano = vegano;
        return this;
    }

    @Override
    public PreparoBuilder setSemLactose(boolean semLactose) {
        this.semLactose = semLactose;
        return this;
    }

    @Override
    public PreparoBuilder setSemGluten(boolean semGluten) {
        this.semGluten = semGluten;
        return this;
    }

    @Override
    public PreparoBuilder setReduzidoSodio(boolean reduzidoSodio) {
        this.reduzidoSodio = reduzidoSodio;
        return this;
    }

    @Override
    public PreparoBuilder setModoDeFazer(String modo) {
        this.modo = modo;
        return this;
    }

    @Override
    public PreparoBuilder setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
        return this;
    }

    public Preparo getPreparo(){
        return new Preparo(nome, lowCarb, vegano, semLactose, reduzidoSodio, modo);
    }
}
