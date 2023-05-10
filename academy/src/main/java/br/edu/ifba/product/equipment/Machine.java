package br.edu.ifba.product.equipment;

public final class Machine extends Equipment {

    private static Machine instance;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void toUse() {
        System.out.println("Using machine ['" + brand + " | "+ description + "']");
    }
}
