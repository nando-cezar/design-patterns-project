package br.edu.ifba.works.abstractFactory.product.extension;

import br.edu.ifba.works.abstractFactory.product.content.ContentModel;

import java.util.List;

public interface ContentExtension {
    void buildingStruture(List<ContentModel> contentModels);
}
