package br.edu.ifba.works.abstractFactory.creator;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.extension.HtmlExtension;

public class HtmlExtensionConcreteCreator extends TemplateCreator{
    @Override
    public Markdown createTemplates() {
        return new HtmlExtension();
    }
}
