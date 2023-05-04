package br.edu.ifba.product.equipment;

import br.edu.ifba.product.equipment.Equipment;

public class Accessory extends Equipment {

    private final String description;

    public Accessory(String description, String identifier, int quantity) {
        super(identifier, quantity);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void toUse() {
        System.out.println("Using accessory");
    }
}
