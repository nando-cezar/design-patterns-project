package br.edu.ifba.works.abstractFactory.factory;

import br.edu.ifba.works.abstractFactory.product.content.AlbumHtmlComplete;
import br.edu.ifba.works.abstractFactory.product.content.AlbumLatexComplete;
import br.edu.ifba.works.abstractFactory.product.content.ContentModel;
import br.edu.ifba.works.abstractFactory.product.extension.ContentExtention;
import br.edu.ifba.works.abstractFactory.product.extension.HtmlExtention;
import br.edu.ifba.works.abstractFactory.product.extension.LatexExtention;
import br.edu.ifba.works.factoryMethod.product.Works;

public class AlbumLatexCompleteContreteFactory implements ConfigurationAbstractFactory{
    @Override
    public ContentExtention createContentExtention() {
        return new LatexExtention();
    }
    @Override
    public ContentModel createContentModel(Works product) { return new AlbumLatexComplete(product); }
}
