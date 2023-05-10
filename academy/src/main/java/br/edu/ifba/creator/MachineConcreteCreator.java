package br.edu.ifba.creator;

import br.edu.ifba.product.equipment.Equipment;
import br.edu.ifba.product.equipment.Machine;

public class MachineConcreteCreator extends EquipmentCreator {

    public MachineConcreteCreator() {}
    @Override
    public Equipment createEquipament() {
        System.out.println("Machine: Create equipment.");
        return new Machine();
    }

}
