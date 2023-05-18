package org.example.singleton;

import org.example.exception.NutrienteNaoEncontradoException;
import org.example.model.Nutriente;

public interface ArmazemNutrientes {
    Nutriente create(String nome, Nutriente nutriente);
    Nutriente create(String nome) throws NutrienteNaoEncontradoException;
}
