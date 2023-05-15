package br.edu.ifba.works;

import br.edu.ifba.works.abstractFactory.factory.*;
import br.edu.ifba.works.abstractFactory.product.content.AlbumHtmlComplete;
import br.edu.ifba.works.abstractFactory.product.content.AlbumLatexComplete;
import br.edu.ifba.works.abstractFactory.product.content.HtmlSummedUp;
import br.edu.ifba.works.abstractFactory.product.content.LatexSummedUp;
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
        System.out.println("\nFinished!");
    }

    private static void runBusinessLogicQ1()
            throws IOException,
            ClassNotFoundException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException
    {
        System.out.println("Factory method in execution...\n");

        WorksCreator creator = WorksCreator.getWorksWithProp("Book");
        Works product = creator.getWorks("Title", 2030, 20.00);

        var book = (Book) product;
        book.setPublishingCompany("XPTO Publishing Company");
        book.setLanguage("XPTO language");
        book.setAuthor("XPTO Author");
        book.setPageNumbers(30);
        book.toXML();
        System.out.println();
        book.toJSON();
    }

    private static void runBusinessLogicQ2()
            throws IOException,
            ClassNotFoundException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException
    {
        System.out.println("\nAbstract factory in execution...");

        WorksCreator creator = WorksCreator.getWorksWithProp("Album");
        Works product = creator.getWorks("Title Album", 2030, 20.00);

        var album = (Album) product;
        album.setRecordCompany("XPTO Record Company");
        album.setStudio("XPTO Studio");
        album.setAuthor("XPTO Author");
        album.setDuration(30.0);

        ConfigurationAbstractFactory conf;

        conf = new AlbumHtmlCompleteContreteFactory();
        var dataContentAlbumHtml = (AlbumHtmlComplete) conf.createContentModel(album);
        var dataExtention = conf.createContentExtention();
        dataExtention.buildingStruture(List.of(dataContentAlbumHtml));

        System.out.println();

        conf = new HtmlSummedUpContreteFactory();
        var dataContentAlbumHtmlSummedUp = (HtmlSummedUp) conf.createContentModel(album);
        dataContentAlbumHtmlSummedUp.setAuthor(album.getAuthor());
        dataExtention = conf.createContentExtention();
        dataExtention.buildingStruture(List.of(dataContentAlbumHtmlSummedUp));

        System.out.println();

        conf = new AlbumLatexCompleteContreteFactory();
        var dataContentAlbumLatex = (AlbumLatexComplete) conf.createContentModel(album);
        dataExtention = conf.createContentExtention();
        dataExtention.buildingStruture(List.of(dataContentAlbumLatex));

        System.out.println();

        conf = new LatexSummedUpContreteFactory();
        var dataContentAlbumLatexSummedUp = (LatexSummedUp) conf.createContentModel(album);
        dataContentAlbumLatexSummedUp.setAuthor(album.getAuthor());
        dataContentAlbumLatexSummedUp.setTitle(album.getTitle());
        dataContentAlbumLatexSummedUp.setYear(album.getYear());
        dataExtention = conf.createContentExtention();
        dataExtention.buildingStruture(List.of(dataContentAlbumLatexSummedUp));

    }
}
