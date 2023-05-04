package br.edu.ifba.product.equipment;

import br.edu.ifba.product.equipment.Equipment;

public class Dumbbell extends Equipment {

    private final double weight;

    public Dumbbell(double weight, String identifier, int quantity) {
        super(identifier, quantity);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void toUse() {
        System.out.println("Using dumbbell");
    }
}
