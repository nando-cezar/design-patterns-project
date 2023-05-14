package br.edu.ifba.works.abstractFactory.product.extension;

import br.edu.ifba.works.abstractFactory.product.content.ContentModel;

import java.util.List;

public class HtmlExtention implements ContentExtention {

    public HtmlExtention() {}
    @Override
    public void buildingStruture(List<ContentModel> contentModels) {
        System.out.println("Building HTML...");
        this.print(contentModels);
    }

    private void print(List<ContentModel> contentModels){
        System.out.println(
            """
            <HTML>
            <HEAD></HEAD>
            <BODY>
            """
        );
        for (var content: contentModels)
            System.out.println(content.buildingContent());

        System.out.println("</BODY> ");
    }
}
