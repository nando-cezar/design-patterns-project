package org.example.model;

public abstract class Nutriente {

    private String nome;
    private int unidade;
    private double caloriaPorUnidade;

    public Nutriente(String nome, int unidade, double caloriaPorUnidade) {
        this.nome = nome;
        this.unidade = unidade;
        this.caloriaPorUnidade = caloriaPorUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public double getCaloriaPorUnidade() {
        return caloriaPorUnidade;
    }

    public void setCaloriaPorUnidade(double caloriaPorUnidade) {
        this.caloriaPorUnidade = caloriaPorUnidade;
    }
}
