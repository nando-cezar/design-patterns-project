package org.example.model;

import org.example.prototype.Prototipo;

public class Disciplina extends Produto {

    private Integer chTotal;
    private Double pctCumprido;

    public Disciplina(Disciplina disciplina) {
        super(disciplina);
        this.chTotal = disciplina.getChTotal();
        this.pctCumprido = disciplina.getPctCumprido();
    }

    public Disciplina(String codigo, String nome) {
        super(codigo, nome);
    }

    public Integer getChTotal() {
        return chTotal;
    }

    public void setChTotal(Integer chTotal) {
        this.chTotal = chTotal;
    }

    public Double getPctCumprido() {
        return pctCumprido;
    }

    public void setPctCumprido(Double pctCumprido) {
        this.pctCumprido = pctCumprido;
    }

    @Override
    public Double getPreco() {
        return null;
    }

    @Override
    public Prototipo clonar() {
        return new Disciplina(this);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "chTotal=" + chTotal +
                ", pctCumprido=" + pctCumprido +
                '}';
    }
}
