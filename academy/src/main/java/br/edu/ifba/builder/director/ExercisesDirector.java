package br.edu.ifba.builder.director;

import br.edu.ifba.builder.concrete.EquipmentBuilder;

import java.util.List;

public class ExercisesDirector {

    public void constructEquiment(EquipmentBuilder builder){
        builder
                .reset()
                .setDescription("Description builder")
                .setType(List.of(br.edu.ifba.builder.product.exercises.Type.Mobilidade))
                .setMuscleGroup(List.of("Muscle Group I", "Muscle Group II"));
    }
}