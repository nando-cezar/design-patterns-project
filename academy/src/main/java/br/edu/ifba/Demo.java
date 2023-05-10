package br.edu.ifba;

import br.edu.ifba.singleton.DumbbellSingleton;
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
        EquipmentSingleton machineSingleton = new MachineSingleton();
        EquipmentSingleton dumbbellSingleton = new DumbbellSingleton();

        String[] machineArgs = {"Brand machine", "Description machine"};

        String[] dumbbellArgs = {"100"};

        machineSingleton.newInstance(
                "Machine",
                "MAC",
                5,
                machineArgs
        ).toUse();

        machineSingleton.newInstance(
                "Machine",
                "MAC",
                5,
                machineArgs
        ).toUse();

        dumbbellSingleton.newInstance(
                "Dumbbell",
                "DUMB",
                3,
                dumbbellArgs
        ).toUse();
    }
}