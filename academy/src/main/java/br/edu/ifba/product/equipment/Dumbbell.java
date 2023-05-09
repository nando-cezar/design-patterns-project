package br.edu.ifba.product.equipment;

public class Dumbbell extends Equipment {

    private static Dumbbell instance;
    private final double weight;

    private Dumbbell(double weight, String identifier, int quantity) {
        super(identifier, quantity);
        this.weight = weight;
    }

    public static Dumbbell getInstance(double weight, String identifier, int quantity){
        if(instance == null)
            instance = new Dumbbell(weight, identifier, quantity);

        if(instance.getIdentifier().equals(identifier))
            instance.setQuantity(quantity);

        return instance;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void toUse() {
        System.out.println("Using dumbbell");
    }
}
