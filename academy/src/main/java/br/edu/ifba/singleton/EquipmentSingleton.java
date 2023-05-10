package br.edu.ifba.singleton;

import br.edu.ifba.creator.EquipmentCreator;
import br.edu.ifba.product.equipment.Equipment;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class EquipmentSingleton {

    private static Equipment instance;

    public void newInstance(String equipmentType, String identifier, int quantity, String ...args)
            throws IOException,
            ClassNotFoundException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException
    {
        EquipmentCreator creator = EquipmentCreator.getEquipmentWithProp(equipmentType);
        Equipment product = creator.usingEquipment(identifier, quantity);

        if(instance != null && instance.getIdentifier().equals(identifier)){
            instance.setQuantity(quantity);
            instance.toUse();
        }

        if(instance == null){
            setAttributes(product, args);
            instance = product;
            instance.toUse();
        }

    }

    public abstract void setAttributes(Equipment product, String ...args);
}
