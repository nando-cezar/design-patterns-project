package br.edu.ifba.works.abstractFactory.creator;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.extension.LatexExtension;

public class LatexExtensionConcreteCreator extends TemplateCreator{
    @Override
    public Markdown createTemplates() {
        return new LatexExtension();
    }
}
