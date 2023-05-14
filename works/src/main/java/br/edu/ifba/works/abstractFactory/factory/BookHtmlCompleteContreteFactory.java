package br.edu.ifba.works.abstractFactory.factory;

import br.edu.ifba.works.abstractFactory.product.content.AlbumHtmlComplete;
import br.edu.ifba.works.abstractFactory.product.content.BookHtmlComplete;
import br.edu.ifba.works.abstractFactory.product.content.ContentModel;
import br.edu.ifba.works.abstractFactory.product.extension.ContentExtention;
import br.edu.ifba.works.abstractFactory.product.extension.HtmlExtention;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookHtmlCompleteContreteFactory implements ConfigurationAbstractFactory{
    @Override
    public ContentExtention createContentExtention() {
        return new HtmlExtention();
    }
    @Override
    public ContentModel createContentModel(Works product) { return new BookHtmlComplete(product); }
}
