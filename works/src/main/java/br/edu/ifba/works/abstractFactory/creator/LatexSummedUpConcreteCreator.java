package br.edu.ifba.works.abstractFactory.creator;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.content.HtmlSummedUp;
import br.edu.ifba.works.abstractFactory.product.content.LatexSummedUp;

public class LatexSummedUpConcreteCreator extends TemplateCreator{
    @Override
    public Markdown createTemplates() {
        return new LatexSummedUp();
    }
}
