package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.factoryMethod.product.Works;

public class HtmlSummedUp extends Markdown implements ContentModel {

    public HtmlSummedUp() {}

    public HtmlSummedUp(Works works) {
        super(works);
    }

    @Override
    public String buildingContent() {
        return "<!--" + this.getTitle() + "-->\n" +
                "<bold>" + this.getTitle() + "</bold>\n" +
                "<italic>" + this.getAuthor() + " " + this.getYear() + "</italic>\n";
    }

}
