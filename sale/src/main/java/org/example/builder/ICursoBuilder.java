package org.example.builder;

import org.example.model.Disciplina;
import org.example.model.Livro;

import java.util.List;

public interface ICursoBuilder {
    ICursoBuilder reset();
    ICursoBuilder setCodigo(String codigo);
    ICursoBuilder setNome(String nome);
    ICursoBuilder setChTotal(Integer chTotal);
    ICursoBuilder setPctCumprido(Double pctCumprido);
    ICursoBuilder setDisciplinas(List<Disciplina> disciplinas);
    ICursoBuilder setLivros(List<Livro> livros);

}
