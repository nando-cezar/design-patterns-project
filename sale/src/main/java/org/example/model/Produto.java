package org.example.model;

import org.example.prototype.Prototipo;

public abstract class Produto implements Prototipo {

    private String codigo;
    private String nome;

    public Produto(Produto produto) {
        this.codigo = produto.getCodigo();
        this.nome = produto.getNome();
    }

    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double getPreco();
}
