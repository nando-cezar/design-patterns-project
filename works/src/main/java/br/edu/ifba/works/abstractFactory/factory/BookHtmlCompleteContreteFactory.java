package br.edu.ifba.works.abstractFactory.factory;

import br.edu.ifba.works.abstractFactory.creator.TemplateCreator;
import br.edu.ifba.works.abstractFactory.product.content.ContentModel;
import br.edu.ifba.works.abstractFactory.product.extension.ContentExtension;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookHtmlCompleteContreteFactory implements ConfigurationAbstractFactory{
    @Override
    public ContentExtension createContentExtention() {
        try {
            return (ContentExtension) TemplateCreator.getTemplateWithProp("HtmlExtension");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public ContentModel createContentModel(Works product) {
        try {
            return (ContentModel) TemplateCreator.getTemplateWithProp("BookHtmlComplete", product);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
