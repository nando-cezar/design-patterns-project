package br.edu.ifba.academy.factoryMethod.creator;

import br.edu.ifba.academy.factoryMethod.product.Accessory;
import br.edu.ifba.academy.factoryMethod.product.Equipment;

public class AccessoryConcreteCreator extends EquipmentCreator {

    @Override
    public Equipment createEquipament() {
        System.out.println("Accessory: Create equipment.");
        return new Accessory();
    }
}
