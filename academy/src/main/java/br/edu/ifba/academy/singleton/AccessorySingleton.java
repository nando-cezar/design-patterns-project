package br.edu.ifba.academy.singleton;

import br.edu.ifba.academy.factoryMethod.product.Accessory;
import br.edu.ifba.academy.factoryMethod.product.Equipment;

public class AccessorySingleton extends EquipmentSingleton{
    @Override
    public void setAttributes(Equipment product, String... args) {
        var machine = (Accessory) product;
        machine.setDescription(args[0]);
    }
}
