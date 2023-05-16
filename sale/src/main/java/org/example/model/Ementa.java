package org.example.model;

import org.example.prototype.Prototipo;

import java.util.List;

public class Ementa extends Produto{

    private Integer chTotal;
    private Double pctCumprido;
    private List<Disciplina> disciplinas;
    private List<Livro> livros;

    public Ementa(Ementa ementa) {
        super(ementa);
        this.chTotal = ementa.getChTotal();
        this.pctCumprido = ementa.getPctCumprido();
        this.disciplinas = ementa.getDisciplinas();
        this.livros = ementa.getLivros();
    }

    public Ementa(String codigo, String nome, Integer chTotal, Double pctCumprido, List<Disciplina> disciplinas, List<Livro> livros) {
        super(codigo, nome);
        this.chTotal = chTotal;
        this.pctCumprido = pctCumprido;
        this.disciplinas = disciplinas;
        this.livros = livros;
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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public Double getPreco() {
        return null;
    }

    @Override
    public Prototipo clonar() {
        return new Ementa(this);
    }

    @Override
    public String toString() {
        return "Ementa{" +
                "chTotal=" + chTotal +
                ", pctCumprido=" + pctCumprido +
                ", disciplinas=" + disciplinas +
                ", livros=" + livros +
                '}';
    }
}
