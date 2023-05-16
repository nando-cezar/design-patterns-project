package org.example.model;

import org.example.builder.CursoConcreteBuilder;
import org.example.builder.CursoDirector;
import org.example.builder.ICursoBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictCurso {

    private Map<String, Produto> controladores = new HashMap();
    private static DictCurso dicionario = null;

    public static DictCurso instance() {
        if (dicionario == null) {
            dicionario = new DictCurso();
        }
        return dicionario;
    }

    private DictCurso() {
        this.init();
    }

    public void init() {
        ICursoBuilder builder = new CursoConcreteBuilder();
        CursoDirector director = new CursoDirector();
        var data = (CursoConcreteBuilder) director.constructCurso(builder);

        this.registrar("Curso 01", data.getCurso());
    }

    public void registrar(String apelido, Produto produto) {
        this.controladores.put(apelido, produto);
    }

    public Produto get(String apelido) {
        return (Produto) this.controladores.get(apelido).clonar();
    }
}
