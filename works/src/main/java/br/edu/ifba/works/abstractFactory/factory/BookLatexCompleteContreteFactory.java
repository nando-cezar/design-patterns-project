package br.edu.ifba.works.abstractFactory.factory;

import br.edu.ifba.works.abstractFactory.product.content.AlbumLatexComplete;
import br.edu.ifba.works.abstractFactory.product.content.BookLatexComplete;
import br.edu.ifba.works.abstractFactory.product.content.ContentModel;
import br.edu.ifba.works.abstractFactory.product.extension.ContentExtention;
import br.edu.ifba.works.abstractFactory.product.extension.LatexExtention;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookLatexCompleteContreteFactory implements ConfigurationAbstractFactory{
    @Override
    public ContentExtention createContentExtention() {
        return new LatexExtention();
    }
    @Override
    public ContentModel createContentModel(Works product) { return new BookLatexComplete(product); }
}
