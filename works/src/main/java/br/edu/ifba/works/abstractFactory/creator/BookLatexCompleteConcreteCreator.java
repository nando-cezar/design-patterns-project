package br.edu.ifba.works.abstractFactory.creator;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.content.BookHtmlComplete;
import br.edu.ifba.works.abstractFactory.product.content.BookLatexComplete;

public class BookLatexCompleteConcreteCreator extends TemplateCreator{
    @Override
    public Markdown createTemplates() {
        return new BookLatexComplete();
    }
}
