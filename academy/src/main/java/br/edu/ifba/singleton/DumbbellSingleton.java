package br.edu.ifba.singleton;

import br.edu.ifba.factoryMethod.product.equipment.Dumbbell;
import br.edu.ifba.factoryMethod.product.equipment.Equipment;

public class DumbbellSingleton extends EquipmentSingleton{
    @Override
    public void setAttributes(Equipment product, String... args) {
        var machine = (Dumbbell) product;
        machine.setWeight(Double.parseDouble(args[0]));
    }
}
