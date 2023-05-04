package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Equipment;
import br.edu.ifba.product.equipment.Machine;
import br.edu.ifba.product.exercises.Cardio;
import br.edu.ifba.product.exercises.Crunch;
import br.edu.ifba.product.exercises.Exercises;
import br.edu.ifba.product.exercises.Type;

import java.util.List;

public class PerformanceCardioImpl implements Performance{
    @Override
    public Equipment createEquipament() {
        return Machine.getInstance(
                "Bicicleta ergométrica",
                "XPTO",
                "XPTO123",
                1000
        );
    }

    @Override
    public List<Exercises> createExercises() {
        return List.of(
                new Cardio(
                        "Bicicleta",
                        List.of(Type.Cardiovascular),
                        List.of("Posterior", "Quadriceps")
                ),
                new Crunch(
                        "Abdominal bicicleta",
                        List.of(Type.Resistido, Type.Funcional),
                        List.of("Abdômen")
                )
        );
    }
}
