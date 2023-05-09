package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Dumbbell;
import br.edu.ifba.product.equipment.Equipment;

public class DumbbellConcreteCreator extends EquipmentCreator {

    private final double weight;
    private final String identifier;
    private final int quantity;

    public DumbbellConcreteCreator(double weight, String identifier, int quantity) {
        this.weight = weight;
        this.identifier = identifier;
        this.quantity = quantity;
    }
    @Override
    public Equipment createEquipament() {
        return Dumbbell.getInstance(weight, identifier, quantity);
    }
}
