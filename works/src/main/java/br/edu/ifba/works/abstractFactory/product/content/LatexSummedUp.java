package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.factoryMethod.product.Works;

public class LatexSummedUp extends Markdown implements ContentModel {

    public LatexSummedUp() {}

    public LatexSummedUp(Works works) {
        super(works);
    }
    @Override
    public String buildingContent() {
        return "% " + this.getTitle() + "\n" +
                "\"textbf {" + this.getTitle() + "}\n" +
                "\"emph {" + this.getAuthor() + " (" + this.getYear() + ")}\n";
    }
}
