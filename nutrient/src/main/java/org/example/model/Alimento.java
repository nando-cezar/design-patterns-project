package org.example.model;

public class Alimento {

    private String nome;
    private QuantidadeMacro quantidadeMacro;

    public Alimento(String nome, QuantidadeMacro quantidadeMacro) {
        this.nome = nome;
        this.quantidadeMacro = quantidadeMacro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public QuantidadeMacro getQuantidadeMacro() {
        return quantidadeMacro;
    }

    public void setQuantidadeMacro(QuantidadeMacro quantidadeMacro) {
        this.quantidadeMacro = quantidadeMacro;
    }
}
