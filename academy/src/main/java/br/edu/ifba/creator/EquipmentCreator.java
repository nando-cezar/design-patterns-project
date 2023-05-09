package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Equipment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public abstract class EquipmentCreator {

    String loadConf(String name) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/factory.conf"));
        for(Object key : prop.keySet())
            if(name.equals(key))
                return (String) prop.get(key);
        return null;
    }

    public void getEquipmentWithProp(String name) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
        String className = loadConf(name);
        EquipmentCreator creator = (EquipmentCreator)
                Class.forName(className)
                        .getConstructor()
                        .newInstance();
        creator.usingEquipment();
    }

    void usingEquipment(){
        Equipment equipment = createEquipament();
        equipment.toUse();
    }

    public abstract Equipment createEquipament();
}
