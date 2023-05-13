package br.edu.ifba.academy.factoryMethod.creator;

import br.edu.ifba.academy.factoryMethod.product.Dumbbell;
import br.edu.ifba.academy.factoryMethod.product.Equipment;

public class DumbbellConcreteCreator extends EquipmentCreator {

    @Override
    public Equipment createEquipament() {
        System.out.println("Dumbbell: Create equipment.");
        return new Dumbbell();
    }
}
