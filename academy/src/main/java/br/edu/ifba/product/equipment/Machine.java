package br.edu.ifba.product.equipment;

public final class Machine extends Equipment {

    private static Machine instance;
    private final String description;
    private final String brand;

    private Machine(String description, String brand, String identifier, int quantity) {
        super(identifier, quantity);
        this.description = description;
        this.brand = brand;
    }

    public static Machine getInstance(String description, String brand, String identifier, int quantity){
        if(instance == null)
            instance = new Machine(description, brand, identifier, quantity);

        if(instance.getIdentifier().equals(identifier))
            instance.setQuantity(quantity);

        return instance;
    }


    @Override
    public void toUse() {
        System.out.println("Using machine '" + description + "'...");
    }
}
