package br.edu.ifba.factoryMethod.creator;

import br.edu.ifba.factoryMethod.product.equipment.Dumbbell;
import br.edu.ifba.factoryMethod.product.equipment.Equipment;

public class DumbbellConcreteCreator extends EquipmentCreator {

    @Override
    public Equipment createEquipament() {
        System.out.println("Dumbbell: Create equipment.");
        return new Dumbbell();
    }
}
