package br.edu.ifba.product.exercises;

import br.edu.ifba.product.equipment.Equipment;

import java.util.List;

public abstract class Exercises {

    private final String description;
    private final List<Type> type;
    private final List<String> muscleGroup;

    public Exercises(String description, List<Type> type, List<String> muscleGroup) {
        this.description = description;
        this.type = type;
        this.muscleGroup = muscleGroup;
    }

    public String getDescription() {
        return description;
    }

    public List<Type> getType() {
        return type;
    }

    public List<String> getMuscleGroup() {
        return muscleGroup;
    }

    public abstract void toExecute();
}
