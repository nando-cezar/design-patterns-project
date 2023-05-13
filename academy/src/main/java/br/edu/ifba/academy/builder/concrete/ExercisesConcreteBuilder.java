package br.edu.ifba.academy.builder.concrete;

import br.edu.ifba.academy.builder.product.Exercises;
import br.edu.ifba.academy.builder.product.Type;

import java.util.List;

public class ExercicesConcreteBuilder implements ExercisesBuilder {

    private String description;
    private List<Type> type;
    private List<String> muscleGroup;

    @Override
    public ExercisesBuilder newInstance() {
        return new ExercicesConcreteBuilder();
    }

    @Override
    public ExercisesBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public ExercisesBuilder setType(List<Type> type) {
        this.type = type;
        return this;
    }

    @Override
    public ExercisesBuilder setMuscleGroup(List<String> muscleGroup) {
        this.muscleGroup = muscleGroup;
        return this;
    }

    public Exercises builder(){
        return new Exercises(description, type, muscleGroup);
    }
}
