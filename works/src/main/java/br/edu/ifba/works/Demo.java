package br.edu.ifba.works;

import br.edu.ifba.works.abstractFactory.factory.AlbumHtmlCompleteContreteFactory;
import br.edu.ifba.works.abstractFactory.factory.ConfigurationAbstractFactory;
import br.edu.ifba.works.abstractFactory.product.content.AlbumComplete;
import br.edu.ifba.works.factoryMethod.creator.WorksCreator;
import br.edu.ifba.works.factoryMethod.product.Album;
import br.edu.ifba.works.factoryMethod.product.Book;
import br.edu.ifba.works.factoryMethod.product.Works;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Demo {

    public static void main(String[] args)
            throws IOException,
            ClassNotFoundException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException
    {
        System.out.println("Initializer...");
        runBusinessLogicQ1();
        runBusinessLogicQ2();
        System.out.println("Finished!");
    }

    private static void runBusinessLogicQ1() throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Factory method in execution...");

        WorksCreator creator = WorksCreator.getEquipmentWithProp("Book");
        Works product = creator.getWorks("Title", 2030, 20.00);

        var book = (Book) product;
        book.setPublishingCompany("XPTO Publishing Company");
        book.setLanguage("XPTO language");
        book.setAuthor("XPTO Author");
        book.setPageNumbers(30);
        book.toXML();
        book.toJSON();
    }

    private static void runBusinessLogicQ2() throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Abstract factory in execution...");

        WorksCreator creator = WorksCreator.getEquipmentWithProp("Album");
        Works product = creator.getWorks("Title", 2030, 20.00);

        var album = (Album) product;
        album.setRecordCompany("XPTO Record Company");
        album.setStudio("XPTO Studio");
        album.setAuthor("XPTO Author");
        album.setDuration(30.0);

        ConfigurationAbstractFactory conf = new AlbumHtmlCompleteContreteFactory();
        var dataContent = (AlbumComplete) conf.createContentModel(album);
        var dataExtention = conf.createContentExtention();
        dataExtention.buildingStruture(List.of(dataContent));

    }
}