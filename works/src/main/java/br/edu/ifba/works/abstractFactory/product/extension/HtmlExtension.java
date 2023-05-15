package br.edu.ifba.works.abstractFactory.product.extension;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.content.ContentModel;
import br.edu.ifba.works.factoryMethod.product.Works;

import java.util.List;

public class HtmlExtension extends Markdown implements ContentExtension {

    public HtmlExtension() {}

    public HtmlExtension(Works works) {
        super(works);
    }
    @Override
    public void buildingStruture(List<ContentModel> contentModels) {
        System.out.println("Building HTML...\n");
        this.print(contentModels);
    }

    private void print(List<ContentModel> contentModels){
        System.out.print(
            """
            <HTML>
            <HEAD></HEAD>
            <BODY>
            """
        );
        for (var content: contentModels)
            System.out.print(content.buildingContent());

        System.out.println("</BODY> ");
    }

}
