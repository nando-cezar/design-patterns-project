package org.example.factoryMethod.creator;

import org.example.factoryMethod.model.Carboidrato;
import org.example.model.Nutriente;

public class CarboidratoConcreteCreator extends NutrienteCreator{
    @Override
    public Nutriente createNutriente(String nome, int unidade, double caloriaPorUnidad) {
        return new Carboidrato(nome, unidade, caloriaPorUnidad);
    }
}
