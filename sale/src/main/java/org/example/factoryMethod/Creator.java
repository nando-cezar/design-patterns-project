package org.example.factoryMethod;

import org.example.model.Produto;

public abstract class Creator {

    public Produto getProduto(String codigo, String nome){
        Produto produto = createProduto(codigo, nome);
        return produto;
    }

    public abstract Produto createProduto(String codigo, String nome);
}
