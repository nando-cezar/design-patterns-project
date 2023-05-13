package br.edu.ifba;

import br.edu.ifba.academy.builder.concrete.ExercicesConcreteBuilder;
import br.edu.ifba.academy.builder.director.ExercisesDirector;
import br.edu.ifba.academy.singleton.DumbbellSingleton;
import br.edu.ifba.academy.singleton.EquipmentSingleton;
import br.edu.ifba.academy.singleton.MachineSingleton;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Initializer...");
        runBusinessLogicQ1();
        runBusinessLogicQ2();
        System.out.println("Finished!");
    }

    private static void runBusinessLogicQ1() throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("Factory method with singleton in execution...");

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

    private static void runBusinessLogicQ2() {
        System.out.println("Builder in execution...");
        ExercisesDirector director = new ExercisesDirector();
        ExercicesConcreteBuilder concreteBuilder = new ExercicesConcreteBuilder();
        director.constructEquiment(concreteBuilder);
        System.out.println(concreteBuilder.builder());
    }
}