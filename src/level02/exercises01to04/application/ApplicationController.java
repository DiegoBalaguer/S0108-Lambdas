package level02.exercises01to04.application;

import level02.exercises01to04.data.DataExercises;

import java.util.List;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 01/05/2025
 */

public class ApplicationController {

    private DataExercises dataInput = new DataExercises();

    public void run() {
        List<String> result = null;

        System.out.println("* EXERCISES LAMBDAS..................");

        System.out.println(System.lineSeparator() + "** Exercise01 - Find all names that start with 'A' and length = 3............." + System.lineSeparator());
        System.out.println("*** List of names: " + System.lineSeparator() + dataInput.getListNames() + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.namesStartCharAndLength(dataInput.getListNames(), "A", 3);

        System.out.println(System.lineSeparator() + "** Exercise02 - List integers with 'e' or 'o' ............." + System.lineSeparator());
        System.out.println("*** List of integers: " + System.lineSeparator() + dataInput.getListIntegers() + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.numbersFormated(dataInput.getListIntegers(), "e", "o");

        System.out.println(System.lineSeparator() + "** Exercise03 - funcional interface Operation ............." + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.showOperationsCalc(dataInput.getFloatNumber01(), dataInput.getFloatNumber02());

        System.out.println(System.lineSeparator() + "** Exercise04 - different lambdas  ............." + System.lineSeparator());
        System.out.println("*** List of objects: " + System.lineSeparator() + dataInput.getListObjects() + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.orderedObjects(dataInput.getListObjects());

        System.out.println(System.lineSeparator() + "✅ process completed correctly");
    }
}
