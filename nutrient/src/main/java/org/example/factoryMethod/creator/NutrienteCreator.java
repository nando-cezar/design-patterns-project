package org.example.factoryMethod.creator;

import org.example.model.Nutriente;

public abstract class NutrienteCreator {

    public Nutriente getNutriente(String nome, int unidade, double caloriaPorUnidad){
        return createNutriente(nome, unidade, caloriaPorUnidad);
    }
    public abstract Nutriente createNutriente(String nome, int unidade, double caloriaPorUnidad);
}
