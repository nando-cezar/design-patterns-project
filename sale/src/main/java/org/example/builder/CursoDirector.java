package org.example.builder;

import org.example.model.Disciplina;
import org.example.model.Livro;
import org.example.model.TipoProduto;

import java.util.List;

public class CursoDirector {

    public ICursoBuilder constructCurso(ICursoBuilder builder) {

        TipoProduto tipo1 = TipoProduto.Disciplina;
        var disciplinaCreator = tipo1.getConcreteCreator();
        var disciplinaProduct = (Disciplina) disciplinaCreator.getProduto("Disciplina 01", "Disciplina XPTO");

        TipoProduto tipo2 = TipoProduto.Livro;
        var livroCreator = tipo2.getConcreteCreator();
        var livroProduct = (Livro) livroCreator.getProduto("Livro 01", "Livro XPTO");

        return builder
                .reset()
                .setCodigo("Curso 01")
                .setNome("XPTO")
                .setChTotal(500)
                .setPctCumprido(50.0)
                .setDisciplinas(List.of(disciplinaProduct))
                .setLivros(List.of(livroProduct));
    }
}
