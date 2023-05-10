package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Dumbbell;
import br.edu.ifba.product.equipment.Equipment;

public class DumbbellConcreteCreator extends EquipmentCreator {

    @Override
    public Equipment createEquipament() {
        System.out.println("Dumbbell: Create equipment.");
        return new Dumbbell();
    }
}
