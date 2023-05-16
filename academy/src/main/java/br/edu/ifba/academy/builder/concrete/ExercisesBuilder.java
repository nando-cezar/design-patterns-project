package br.edu.ifba.academy.builder.concrete;

import br.edu.ifba.academy.builder.product.Type;

import java.util.List;

public interface ExercisesBuilder {

    ExercisesBuilder reset();
    ExercisesBuilder setDescription(String description);
    ExercisesBuilder setType(List<Type> type);
    ExercisesBuilder setMuscleGroup(List<String> muscleGroup);
}
