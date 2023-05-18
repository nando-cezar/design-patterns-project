package org.example.singleton;

import org.example.exception.NutrienteNaoEncontradoException;
import org.example.model.Nutriente;

import java.util.HashMap;
import java.util.Map;

public class CatalogoV2 implements ArmazemNutrientes{

    private static CatalogoV2 instance;
    private Map<String, Nutriente> nutrientes = new HashMap<>();

    private CatalogoV2(){}

    public static CatalogoV2 getInstance(){
        if(instance == null) instance = new CatalogoV2();
        return instance;
    }

    @Override
    public Nutriente create(String nome, Nutriente nutriente) {
        var data = this.nutrientes.get(nome);

        if(data == null){
            this.nutrientes.put(nome, nutriente);
            return this.nutrientes.get(nome);
        }else{
            data.setNome(nutriente.getNome());
            data.setUnidade(nutriente.getUnidade());
            data.setCaloriaPorUnidade(nutriente.getCaloriaPorUnidade());
            this.nutrientes.put(nome, data);
            return this.nutrientes.get(nome);
        }
    }

    @Override
    public Nutriente create(String nome) throws NutrienteNaoEncontradoException {
        var data = nutrientes.get(nome);

        if(data != null) return data;
        throw new NutrienteNaoEncontradoException();
    }
}
