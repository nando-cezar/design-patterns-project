package br.edu.ifba.academy.singleton;

import br.edu.ifba.academy.factoryMethod.creator.EquipmentCreator;
import br.edu.ifba.academy.factoryMethod.product.Equipment;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class EquipmentSingleton {

    private static Equipment instance;

    public Equipment newInstance(String equipmentType, String identifier, int quantity, String ...args)
            throws IOException,
            ClassNotFoundException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException
    {
        EquipmentCreator creator = EquipmentCreator.getEquipmentWithProp(equipmentType);
        Equipment product = creator.usingEquipment(identifier, quantity);

        if(instance != null){
            if(instance.getIdentifier().equals(identifier)){
                instance.incrementQuantity(quantity);
            }else{
                setAttributes(product, args);
                instance = product;
            }
        }else{
            setAttributes(product, args);
            instance = product;
        }

        return instance;
    }

    public abstract void setAttributes(Equipment product, String ...args);
}
