package br.edu.ifba.product.equipment;

public abstract class Equipment {

    private final String identifier;
    private int quantity;

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

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public abstract void toUse();
}
