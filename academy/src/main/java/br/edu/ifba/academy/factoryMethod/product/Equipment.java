package br.edu.ifba.academy.factoryMethod.product;

public abstract class Equipment {

    private String identifier;
    private int quantity;

    public Equipment() {
        this.identifier = null;
        this.quantity = 0;
    }

    public Equipment(String identifier, int quantity) {
        this.identifier = identifier;
        this.quantity = quantity;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void incrementQuantity(int quantity) {
        this.quantity += quantity;
    }

    public abstract void toUse();
}
