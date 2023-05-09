package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Equipment;
import br.edu.ifba.product.equipment.Machine;

public class MachineConcreteCreator extends EquipmentCreator {

    private final String description;
    private final String brand;
    private final String identifier;
    private final int quantity;

    public MachineConcreteCreator(String description, String brand, String identifier, int quantity) {
        this.description = description;
        this.brand = brand;
        this.identifier = identifier;
        this.quantity = quantity;
    }
    @Override
    public Equipment createEquipament() {
        System.out.println("Create equipment.");
        return Machine.getInstance(description, brand, identifier, quantity);
    }

}
