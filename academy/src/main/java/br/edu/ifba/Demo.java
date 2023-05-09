package br.edu.ifba;

import br.edu.ifba.creator.EquipmentCreator;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Demo {

    private static EquipmentCreator create;
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Initializer...");
        runBusinessLogic();
    }


    private static void runBusinessLogic() throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        create = EquipmentCreator.getEquipmentWithProp("Machine");
        var data = create.createEquipament();
        data.toUse();
    }
}