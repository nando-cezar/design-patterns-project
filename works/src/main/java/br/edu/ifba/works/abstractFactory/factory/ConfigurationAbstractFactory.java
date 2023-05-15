package br.edu.ifba.works.abstractFactory.factory;

import br.edu.ifba.works.abstractFactory.product.extension.ContentExtension;
import br.edu.ifba.works.abstractFactory.product.content.ContentModel;
import br.edu.ifba.works.factoryMethod.product.Works;

public interface ConfigurationAbstractFactory {

    ContentExtension createContentExtention();

    ContentModel createContentModel(Works product);
}
