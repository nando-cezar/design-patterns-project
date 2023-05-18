package org.example.singleton;

import org.example.exception.NutrienteNaoEncontradoException;
import org.example.model.Nutriente;

import java.util.HashMap;
import java.util.Map;

public class Catalogo implements ArmazemNutrientes{

    private final Map<String, Nutriente> nutrientes = new HashMap<>();
    @Override
    public Nutriente create(String nome, Nutriente nutriente) {
        var data = nutrientes.get(nome);

        if(data == null){
            nutrientes.put(nome, nutriente);
        }else{
            data.setNome(nutriente.getNome());
            data.setUnidade(nutriente.getUnidade());
            data.setCaloriaPorUnidade(nutriente.getCaloriaPorUnidade());
            nutrientes.put(nome, data);
        }
        return data;
    }

    @Override
    public Nutriente create(String nome) throws NutrienteNaoEncontradoException {
        var data = nutrientes.get(nome);

        if(data != null) return data;
        throw new NutrienteNaoEncontradoException();
    }
}
