package br.edu.ifba.factoryMethod.creator;

import br.edu.ifba.factoryMethod.product.Accessory;
import br.edu.ifba.factoryMethod.product.Equipment;

public class AccessoryConcreteCreator extends EquipmentCreator {

    @Override
    public Equipment createEquipament() {
        System.out.println("Accessory: Create equipment.");
        return new Accessory();
    }
}
