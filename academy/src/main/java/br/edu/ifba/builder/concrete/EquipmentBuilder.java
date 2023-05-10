package br.edu.ifba.builder.concrete;

import br.edu.ifba.builder.product.exercises.Type;

import java.util.List;

public interface EquipmentBuilder {

    EquipmentBuilder reset();
    EquipmentBuilder setDescription(String description);
    EquipmentBuilder setType(List<Type> type);
    EquipmentBuilder setMuscleGroup(List<String> muscleGroup);
}
