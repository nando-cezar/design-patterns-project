package org.example.factoryMethod;

import org.example.model.Curso;
import org.example.model.Disciplina;
import org.example.model.Produto;

public class DisciplinaContreteCreator extends Creator{
    @Override
    public Produto createProduto(String codigo, String nome) {
        return new Disciplina(codigo, nome);
    }
}
