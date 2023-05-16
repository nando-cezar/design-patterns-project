package org.example.model;

import org.example.prototype.Prototipo;

public class Livro extends Produto{

    private String isbn;

    public Livro(Livro livro) {
        super(livro);
        this.isbn = livro.getIsbn();
    }
    public Livro(String codigo, String nome) {
        super(codigo, nome);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public Double getPreco() {
        return null;
    }

    @Override
    public Prototipo clonar() {
        return new Livro(this);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                '}';
    }
}
