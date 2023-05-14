package br.edu.ifba.works.factoryMethod.creator;


import br.edu.ifba.works.factoryMethod.product.Book;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookConcreteCreator extends WorksCreator{
    @Override
    public Works createWorks() {
        return new Book();
    }
}
