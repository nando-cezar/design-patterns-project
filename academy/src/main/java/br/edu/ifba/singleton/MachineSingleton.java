package br.edu.ifba.singleton;

import br.edu.ifba.product.equipment.Equipment;
import br.edu.ifba.product.equipment.Machine;

public class MachineSingleton extends EquipmentSingleton{
    @Override
    public void setAttributes(Equipment product, String... args) {
        var machine = (Machine) product;
        machine.setBrand(args[0]);
        machine.setDescription(args[1]);
    }
}
