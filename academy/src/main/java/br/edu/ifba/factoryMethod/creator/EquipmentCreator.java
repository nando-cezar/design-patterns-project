package br.edu.ifba.factoryMethod.creator;

import br.edu.ifba.factoryMethod.product.Equipment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public abstract class EquipmentCreator {

    private static String loadConf(String name) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/factory.conf"));
        for(Object key : prop.keySet())
            if(name.equals(key))
                return (String) prop.get(key);
        return null;
    }

    public static EquipmentCreator getEquipmentWithProp(String name) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
        String className = loadConf(name);
        return (EquipmentCreator)
                Class.forName(className)
                        .getConstructor()
                        .newInstance();
    }

    public Equipment usingEquipment(String identifier, int quantity){
        Equipment equipment = createEquipament();
        equipment.setIdentifier(identifier);
        equipment.setQuantity(quantity);
        return equipment;
    }

    public abstract Equipment createEquipament();
}
