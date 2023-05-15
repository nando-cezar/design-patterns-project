package br.edu.ifba.works.abstractFactory.creator;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.content.HtmlSummedUp;

public class HtmlSummedUpConcreteCreator extends TemplateCreator{
    @Override
    public Markdown createTemplates() {
        return new HtmlSummedUp();
    }
}
