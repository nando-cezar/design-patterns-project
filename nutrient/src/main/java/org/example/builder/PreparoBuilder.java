package org.example.builder;

import org.example.model.Alimento;

import java.util.List;

public interface PreparoBuilder {
    PreparoBuilder setNome(String nome);
    PreparoBuilder setLowCarb(boolean value);
    PreparoBuilder setVegano(boolean value);
    PreparoBuilder setSemLactose(boolean value);
    PreparoBuilder setSemGluten(boolean value);
    PreparoBuilder setReduzidoSodio(boolean value);
    PreparoBuilder setModoDeFazer(String modo);
    PreparoBuilder setAlimentos(List<Alimento> alimentos);
}
