package br.edu.ifba.works.abstractFactory.creator;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.content.AlbumHtmlComplete;
import br.edu.ifba.works.abstractFactory.product.content.AlbumLatexComplete;

public class AlbumLatexCompleteConcreteCreator extends TemplateCreator{
    @Override
    public Markdown createTemplates() {
        return new AlbumLatexComplete();
    }
}
