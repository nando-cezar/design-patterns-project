package org.example;

import org.example.builder.CursoConcreteBuilder;
import org.example.builder.CursoDirector;
import org.example.builder.EmentaCursoConcreteBuilder;
import org.example.model.DictCurso;
import org.example.model.Produto;
import org.example.model.TipoProduto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema...");
        q1();
        System.out.println();
        q2();
        System.out.println();
        q3();
        System.out.println("Finalizado");
    }

    private static void q1(){
        TipoProduto tipo = TipoProduto.Livro;
        var creator = tipo.getConcreteCreator();
        var produto = creator.createProduto("1", "Produto 01");
        System.out.println(produto.getNome());
    }

    private static void q2(){
        CursoDirector director = new CursoDirector();
        CursoConcreteBuilder cursoBuiler = new CursoConcreteBuilder();
        director.constructCurso(cursoBuiler);
        System.out.println(cursoBuiler.getCurso().getNome());

        EmentaCursoConcreteBuilder ementaBuilder = new EmentaCursoConcreteBuilder();
        director.constructCurso(ementaBuilder);
        System.out.println(ementaBuilder.getEmenta().getNome());
    }

    private static void q3(){
        DictCurso dicionario = DictCurso.instance();

        CursoDirector director = new CursoDirector();
        CursoConcreteBuilder cursoBuiler = new CursoConcreteBuilder();
        director.constructCurso(cursoBuiler);

        dicionario.registrar("Curso 01", cursoBuiler.getCurso());

        Produto produto01 = dicionario.get("Curso 01");
        Produto produto02 = dicionario.get("Curso 01");
        System.out.println(produto01);
        System.out.println(produto01.getNome());
        System.out.println(produto02);
        System.out.println(produto02.getNome());

        dicionario = DictCurso.instance();
        Produto produto03 = dicionario.get("Curso 01");
        System.out.println(produto03);
        System.out.println(produto03.getNome());
    }
}