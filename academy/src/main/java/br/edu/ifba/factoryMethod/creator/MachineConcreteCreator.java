package br.edu.ifba.factoryMethod.creator;

import br.edu.ifba.factoryMethod.product.equipment.Equipment;
import br.edu.ifba.factoryMethod.product.equipment.Machine;

public class MachineConcreteCreator extends EquipmentCreator {

    public MachineConcreteCreator() {}
    @Override
    public Equipment createEquipament() {
        System.out.println("Machine: Create equipment.");
        return new Machine();
    }

}
