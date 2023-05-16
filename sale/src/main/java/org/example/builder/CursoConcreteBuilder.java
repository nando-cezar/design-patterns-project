package org.example.builder;

import org.example.model.Curso;
import org.example.model.Disciplina;
import org.example.model.Ementa;
import org.example.model.Livro;

import java.util.List;

public class CursoConcreteBuilder implements ICursoBuilder{

    private String codigo;
    private String nome;
    private Integer chTotal;
    private Double pctCumprido;
    private List<Disciplina> disciplinas;
    private List<Livro> livros;

    @Override
    public ICursoBuilder reset() {
        codigo = null;
        nome = null;
        chTotal = null;
        pctCumprido = null;
        disciplinas = null;
        livros = null;
        return this;
    }

    @Override
    public ICursoBuilder setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    @Override
    public ICursoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public ICursoBuilder setChTotal(Integer chTotal) {
        this.chTotal = chTotal;
        return this;
    }

    @Override
    public ICursoBuilder setPctCumprido(Double pctCumprido) {
        this.pctCumprido = pctCumprido;
        return this;
    }

    @Override
    public ICursoBuilder setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
        return this;
    }

    @Override
    public ICursoBuilder setLivros(List<Livro> livros) {
        this.livros = livros;
        return this;
    }

    public Curso getCurso(){
        return new Curso(codigo, nome, chTotal, pctCumprido,  disciplinas,  livros);
    }
}
