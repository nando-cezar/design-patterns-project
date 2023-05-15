package br.edu.ifba.works.abstractFactory.creator;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.factoryMethod.product.Works;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public abstract class TemplateCreator {

    private static String loadConf(String name) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/factory.conf"));
        for(Object key : prop.keySet())
            if(name.equals(key))
                return (String) prop.get(key);
        return null;
    }

    public static Markdown getTemplateWithProp(String name)
            throws InstantiationException,
            IllegalAccessException,
            IllegalArgumentException,
            InvocationTargetException,
            NoSuchMethodException,
            SecurityException,
            ClassNotFoundException,
            IOException
    {
        String className = loadConf(name);
        var creator = (TemplateCreator)
                Class.forName(className)
                        .getConstructor()
                        .newInstance();

        return creator.createTemplates();

    }

    public static Markdown getTemplateWithProp(String name, Works product)
            throws InstantiationException,
            IllegalAccessException,
            IllegalArgumentException,
            InvocationTargetException,
            NoSuchMethodException,
            SecurityException,
            ClassNotFoundException,
            IOException
    {
        String className = loadConf(name);
        var creator = (TemplateCreator)
                Class.forName(className)
                        .getConstructor()
                        .newInstance();

        var data = creator.createTemplates();
        data.setTitle(product.getTitle());
        data.setYear(product.getYear());
        data.setAuthor(null);
        return data;
    }

    public abstract Markdown createTemplates();
}
