package org.example.model;

import org.example.prototype.Prototipo;

import java.util.List;

public class Curso extends Produto{

    private Integer chTotal;
    private Double pctCumprido;
    private List<Disciplina> disciplinas;
    private List<Livro> livros;

    public Curso(Curso curso) {
        super(curso);
        this.chTotal = curso.getChTotal();
        this.pctCumprido = curso.getPctCumprido();
        this.disciplinas = curso.getDisciplinas();
        this.livros = curso.getLivros();
    }

    public Curso(String codigo, String nome, Integer chTotal, Double pctCumprido, List<Disciplina> disciplinas, List<Livro> livros) {
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
        return new Curso(this);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "chTotal=" + chTotal +
                ", pctCumprido=" + pctCumprido +
                ", disciplinas=" + disciplinas +
                ", livros=" + livros +
                '}';
    }
}
