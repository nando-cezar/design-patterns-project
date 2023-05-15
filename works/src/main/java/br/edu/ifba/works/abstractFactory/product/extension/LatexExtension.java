package br.edu.ifba.works.abstractFactory.product.extension;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.abstractFactory.product.content.ContentModel;
import br.edu.ifba.works.factoryMethod.product.Works;

import java.util.List;

public class LatexExtension extends Markdown implements ContentExtension {

    public LatexExtension() {}

    public LatexExtension(Works works) {
        super(works);
    }

    @Override
    public void buildingStruture(List<ContentModel> contentModels) {
        System.out.println("Building LaTex...\n");
        this.print(contentModels);
    }

    private void print(List<ContentModel> contentModels){
        for (var content: contentModels)
            System.out.print(content.buildingContent());
    }
}
