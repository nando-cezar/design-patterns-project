package br.edu.ifba.works.factoryMethod.creator;

import br.edu.ifba.works.factoryMethod.product.Album;
import br.edu.ifba.works.factoryMethod.product.Works;

public class AlbumConcreteCreator extends WorksCreator{
    @Override
    public Works createWorks() {
        return new Album();
    }
}
