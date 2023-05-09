package br.edu.ifba.product.equipment;

public class Accessory extends Equipment {

    private static Accessory instance;
    private final String description;

    private Accessory(String description, String identifier, int quantity) {
        super(identifier, quantity);
        this.description = description;
    }

    public static Accessory getInstance(String description, String identifier, int quantity){
        if(instance == null)
            instance = new Accessory(description, identifier, quantity);

        if(instance.getIdentifier().equals(identifier))
            instance.setQuantity(quantity);

        return instance;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public void toUse() {
        System.out.println("Using accessory");
    }
}
