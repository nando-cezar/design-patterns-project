package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Accessory;
import br.edu.ifba.product.equipment.Equipment;

public class AccessoryConcreteCreator extends EquipmentCreator {

    @Override
    public Equipment createEquipament() {
        System.out.println("Accessory: Create equipment.");
        return new Accessory();
    }
}
