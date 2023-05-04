package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Equipment;
import br.edu.ifba.product.exercises.Exercises;

import java.util.List;

public interface Performance {
    Equipment createEquipament();
    List<Exercises> createExercises();
}
