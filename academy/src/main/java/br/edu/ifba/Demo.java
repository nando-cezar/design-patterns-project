package br.edu.ifba;

import br.edu.ifba.builder.concrete.EquipmentConcreteBuilder;
import br.edu.ifba.builder.director.ExercisesDirector;
import br.edu.ifba.singleton.DumbbellSingleton;
import br.edu.ifba.singleton.EquipmentSingleton;
import br.edu.ifba.singleton.MachineSingleton;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Initializer...");
        runBusinessLogic();
        System.out.println("Finished!");
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

        System.out.println("Builder execution...");
        ExercisesDirector director = new ExercisesDirector();
        EquipmentConcreteBuilder concreteBuilder = new EquipmentConcreteBuilder();
        director.constructEquiment(concreteBuilder);
        System.out.println(concreteBuilder.builder());
    }
}