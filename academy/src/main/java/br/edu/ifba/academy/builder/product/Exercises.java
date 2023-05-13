package br.edu.ifba.academy.builder.product;

import java.util.List;

public class Exercises {

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

    @Override
    public String toString() {
        return "Exercises{" +
                "description='" + description + '\'' +
                ", type=" + type +
                ", muscleGroup=" + muscleGroup +
                '}';
    }
}
