package br.edu.ifba.factoryMethod.product;

public class Accessory extends Equipment {

    private String description;

    public Accessory() {
        super();
    }

    public Accessory(String identifier, int quantity) {
        this(identifier, quantity, null);
    }

    public Accessory(String identifier, int quantity, String description) {
        super(identifier, quantity);
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void toUse() {
        System.out.println("Using machine ['" + super.getIdentifier() + " | " + description + " | " + super.getQuantity() + "']");
    }
}
