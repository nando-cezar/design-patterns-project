package br.edu.ifba.factoryMethod.product.exercises;

import java.util.List;

public class Crunch extends Exercises{
    public Crunch(String description, List<Type> type, List<String> muscleGroup) {
        super(description, type, muscleGroup);
    }

    @Override
    public void toExecute() {
        System.out.println("Training '" + getDescription() + "'...");
    }
}
