package br.edu.ifba.works.abstractFactory.product.extension;

import br.edu.ifba.works.abstractFactory.product.content.ContentModel;

import java.util.List;

public class LatexExtention implements ContentExtention {

    public LatexExtention() {}

    @Override
    public void buildingStruture(List<ContentModel> contentModels) {
        System.out.println("Building LaTex...");
        this.print(contentModels);
    }

    private void print(List<ContentModel> contentModels){
        for (var content: contentModels)
            System.out.println(content.buildingContent());
    }
}
