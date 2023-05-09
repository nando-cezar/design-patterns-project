package br.edu.ifba;

import br.edu.ifba.creator.EquipmentCreator;
import br.edu.ifba.creator.MachineConcreteCreator;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Demo {

    private static EquipmentCreator create;
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Initializer...");
        configure();
        runBusinessLogic();
    }

    private static void configure(){
        create = new MachineConcreteCreator("Esteira", "XPTO", "XPTO123", 1000);
    }

    private static void runBusinessLogic() throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        create.getEquipmentWithProp("Machine");
    }
}