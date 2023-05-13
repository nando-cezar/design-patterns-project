package br.edu.ifba.academy.builder.director;

import br.edu.ifba.academy.builder.product.Type;
import br.edu.ifba.academy.builder.concrete.ExercisesBuilder;


import java.util.List;

public class ExercisesDirector {

    public void constructEquiment(ExercisesBuilder builder){
        builder
                .newInstance()
                .setDescription("Description builder")
                .setType(List.of(Type.Mobilidade))
                .setMuscleGroup(List.of("Muscle Group I", "Muscle Group II"));
    }
}