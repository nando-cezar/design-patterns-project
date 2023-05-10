package br.edu.ifba.singleton;

import br.edu.ifba.factoryMethod.product.equipment.Equipment;
import br.edu.ifba.factoryMethod.product.equipment.Machine;

public class MachineSingleton extends EquipmentSingleton{
    @Override
    public void setAttributes(Equipment product, String... args) {
        var machine = (Machine) product;
        machine.setBrand(args[0]);
        machine.setDescription(args[1]);
    }
}
