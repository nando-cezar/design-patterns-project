package br.edu.ifba.works;

import br.edu.ifba.works.factoryMethod.creator.AlbumConcreteCreator;
import br.edu.ifba.works.factoryMethod.creator.WorksCreator;
import br.edu.ifba.works.factoryMethod.product.Book;
import br.edu.ifba.works.factoryMethod.product.Works;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

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
}
