package br.edu.ifba.works.factoryMethod.creator;


import br.edu.ifba.works.factoryMethod.product.Works;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public abstract class WorksCreator {

    private static String loadConf(String name) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/factory.conf"));
        for(Object key : prop.keySet())
            if(name.equals(key))
                return (String) prop.get(key);
        return null;
    }

    public static WorksCreator getWorksWithProp(String name)
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
        return (WorksCreator)
                Class.forName(className)
                        .getConstructor()
                        .newInstance();
    }

    public Works getWorks(String title, Integer year, Double score){
        Works works = createWorks();
        works.setTitle(title);
        works.setYear(year);
        works.setScore(score);
        return works;
    }

    public abstract Works createWorks();
}
