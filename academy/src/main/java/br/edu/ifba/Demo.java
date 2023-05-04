package br.edu.ifba;

import br.edu.ifba.creator.Performance;
import br.edu.ifba.creator.PerformanceCardioImpl;
import br.edu.ifba.product.equipment.Equipment;
import br.edu.ifba.product.exercises.Exercises;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Initializer...");
        Performance performance = new PerformanceCardioImpl();

        Equipment equipment = performance.createEquipament();
        List<Exercises> exercises = performance.createExercises();

        equipment.toUse();
        exercises.forEach(Exercises::toExecute);

    }
}