package org.example.model;

import org.example.factoryMethod.Creator;
import org.example.factoryMethod.DisciplinaContreteCreator;
import org.example.factoryMethod.LivroContreteCreator;

public enum TipoProduto {

    Disciplina {
        @Override
        public Creator getConcreteCreator() {
            return new DisciplinaContreteCreator();
        }
    },
    Livro {
        @Override
        public Creator getConcreteCreator() {
            return new LivroContreteCreator();
        }
    };

    public abstract Creator getConcreteCreator();
}
