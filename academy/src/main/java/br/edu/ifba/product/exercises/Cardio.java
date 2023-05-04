package br.edu.ifba.product.exercises;

import java.util.List;

public class Cardio extends Exercises{
    public Cardio(String description, List<Type> type, List<String> muscleGroup) {
        super(description, type, muscleGroup);
    }

    @Override
    public void toExecute() {
        System.out.println("Running '" + getDescription() + "'...");
    }
}
