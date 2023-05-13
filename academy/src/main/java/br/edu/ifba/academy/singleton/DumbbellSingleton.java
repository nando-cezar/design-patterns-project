package br.edu.ifba.academy.singleton;

import br.edu.ifba.academy.factoryMethod.product.Dumbbell;
import br.edu.ifba.academy.factoryMethod.product.Equipment;

public class DumbbellSingleton extends EquipmentSingleton{
    @Override
    public void setAttributes(Equipment product, String... args) {
        var machine = (Dumbbell) product;
        machine.setWeight(Double.parseDouble(args[0]));
    }
}
