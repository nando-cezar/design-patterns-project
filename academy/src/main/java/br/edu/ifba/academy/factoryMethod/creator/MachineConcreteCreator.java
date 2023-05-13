package br.edu.ifba.academy.factoryMethod.creator;

import br.edu.ifba.academy.factoryMethod.product.Equipment;
import br.edu.ifba.academy.factoryMethod.product.Machine;

public class MachineConcreteCreator extends EquipmentCreator {

    public MachineConcreteCreator() {}
    @Override
    public Equipment createEquipament() {
        System.out.println("Machine: Create equipment.");
        return new Machine();
    }

}
