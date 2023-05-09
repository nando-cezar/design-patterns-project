package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Accessory;
import br.edu.ifba.product.equipment.Equipment;

public class AccessoryConcreteCreator extends EquipmentCreator {

    private final String description;
    private final String identity;
    private final int quantity;

    private AccessoryConcreteCreator(String description, String identity, int quantity) {
        this.description = description;
        this.identity = identity;
        this.quantity = quantity;
    }

    @Override
    public Equipment createEquipament() {
        return Accessory.getInstance(description, identity, quantity);
    }
}
