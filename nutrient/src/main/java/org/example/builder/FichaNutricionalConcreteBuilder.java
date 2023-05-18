package org.example.builder;

import org.example.model.Alimento;
import org.example.model.FichaNutricional;
import org.example.model.Preparo;

import java.util.List;

public class FichaNutricionalConcreteBuilder implements PreparoBuilder{

    private int qtdeCHO;
    private int qtdePTN;
    private int qtdeLIP;
    @Override
    public PreparoBuilder setNome(String nome) {
        return null;
    }

    @Override
    public PreparoBuilder setLowCarb(boolean value) {
        return null;
    }

    @Override
    public PreparoBuilder setVegano(boolean value) {
        return null;
    }

    @Override
    public PreparoBuilder setSemLactose(boolean value) {
        return null;
    }

    @Override
    public PreparoBuilder setSemGluten(boolean value) {
        return null;
    }

    @Override
    public PreparoBuilder setReduzidoSodio(boolean value) {
        return null;
    }

    @Override
    public PreparoBuilder setModoDeFazer(String modo) {
        return null;
    }

    @Override
    public PreparoBuilder setAlimentos(List<Alimento> alimentos) {
        return null;
    }

    public FichaNutricional getFichaNutricional(){
        return new FichaNutricional(qtdeCHO, qtdePTN, qtdeLIP);
    }
}
