package br.edu.ifba.builder.concrete;

import br.edu.ifba.builder.product.Exercises;
import br.edu.ifba.builder.product.exercises.Type;

import java.util.List;

public class EquipmentConcreteBuilder implements EquipmentBuilder{

    private String description;
    private List<Type> type;
    private List<String> muscleGroup;

    @Override
    public EquipmentBuilder reset() {
        description = null;
        type = null;
        muscleGroup = null;
        return this;
    }

    @Override
    public EquipmentBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public EquipmentBuilder setType(List<Type> type) {
        this.type = type;
        return this;
    }

    @Override
    public EquipmentBuilder setMuscleGroup(List<String> muscleGroup) {
        this.muscleGroup = muscleGroup;
        return this;
    }

    public Exercises builder(){
        return new Exercises(description, type, muscleGroup);
    }
}
