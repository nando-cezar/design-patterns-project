package br.edu.ifba;

import br.edu.ifba.singleton.EquipmentSingleton;
import br.edu.ifba.singleton.MachineSingleton;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Initializer...");
        runBusinessLogic();
    }

    private static void runBusinessLogic() throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        EquipmentSingleton singleton = new MachineSingleton();
        String[] args = {"Brand machine", "Description machine"};
        singleton.newInstance(
                "Machine",
                "XPTO",
                5,
                args
        );
    }
}