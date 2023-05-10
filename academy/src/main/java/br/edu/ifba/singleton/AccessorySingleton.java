package br.edu.ifba.singleton;

import br.edu.ifba.factoryMethod.product.equipment.Accessory;
import br.edu.ifba.factoryMethod.product.equipment.Equipment;

public class AccessorySingleton extends EquipmentSingleton{
    @Override
    public void setAttributes(Equipment product, String... args) {
        var machine = (Accessory) product;
        machine.setDescription(args[0]);
    }
}
