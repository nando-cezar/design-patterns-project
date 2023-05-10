package br.edu.ifba.factoryMethod.product.equipment;

public class Dumbbell extends Equipment {

    private static Dumbbell instance;
    private double weight;

    public Dumbbell() {
        super();
    }

    public Dumbbell(String identifier, int quantity) {
        this(identifier, quantity, 0.0);
    }

    public Dumbbell(String identifier, int quantity, double weight) {
        super(identifier, quantity);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void toUse() {
        System.out.println("Using machine ['" + super.getIdentifier() + " | " + weight + " | " + super.getQuantity() + "']");
    }
}
