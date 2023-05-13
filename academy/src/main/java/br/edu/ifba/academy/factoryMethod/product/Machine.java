package br.edu.ifba.academy.factoryMethod.product;

public final class Machine extends Equipment {

    private String description;
    private String brand;

    public Machine() {
        super();
    }

    public Machine(String identifier, int quantity) {
        this(identifier, quantity, null, null);
    }

    public Machine(String identifier, int quantity, String description, String brand) {
        super(identifier, quantity);
        this.description = description;
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void toUse() {
        System.out.println("Using machine ['" + super.getIdentifier() + " | " + brand + " | " + description + " | " + super.getQuantity() + "']");
    }
}
