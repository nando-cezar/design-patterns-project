package org.example.factoryMethod;

import org.example.model.Curso;
import org.example.model.Livro;
import org.example.model.Produto;

public class LivroContreteCreator extends Creator{
    @Override
    public Produto createProduto(String codigo, String nome) {
        return new Livro(codigo, nome);
    }
}
