package level01.exercises01to08.application;

import level01.exercises01to08.data.DataExercises;

import java.util.List;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 01/05/2025
 */

public class ApplicationController {

    private static final DataExercises dataInput = new DataExercises();

    public void run() {
        List<String> result = null;

        System.out.println("* EXERCISES LAMBDAS..................");

        System.out.println(System.lineSeparator() + "** Exercise01 - words with 'o' .............");
        System.out.println("*** List of words: " + System.lineSeparator() + dataInput.getListWords());
        System.out.println("*** Result:");
        ApplicationWorkers.arrayWithChar(dataInput.getListWords(), "o");

        System.out.println(System.lineSeparator() + "** Exercise02 - word with 'o' and length > 5............." + System.lineSeparator());
        System.out.println("*** List of words: " + System.lineSeparator() + dataInput.getListWords() + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.arrayWithCharAndLength(dataInput.getListWords(), "o", 5);

        System.out.println(System.lineSeparator() + "** Exercise03 - list months with lambda ............." + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.showListMonthsLambda(dataInput.getListMonths());

        System.out.println(System.lineSeparator() + "** Exercise04 - list months with method reference ............." + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.showListMonthsMethodReference(dataInput.getListMonths());

        System.out.println(System.lineSeparator() + "** Exercise05 - show Pi Value  ............." + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.showPiValue();

        System.out.println(System.lineSeparator() + "** Exercise06 - sort mixed list (Shortest to longest string)  ............." + System.lineSeparator());
        System.out.println("*** List of objects: " + System.lineSeparator() + dataInput.getListObjects() + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.orderedMixedListSortToLong(dataInput.getListObjects());

        System.out.println(System.lineSeparator() + "** Exercise07 - sort mixed list (Longest to shortest string)  ............." + System.lineSeparator());
        System.out.println("*** List of objects: " + System.lineSeparator() + dataInput.getListObjects() + System.lineSeparator());
        System.out.println("*** Result:");
        ApplicationWorkers.orderedMixedListLongToSort(dataInput.getListObjects());

        System.out.println(System.lineSeparator() + "** Exercise08 - string reverser .............");
        System.out.println("*** Word: " + System.lineSeparator() + dataInput.getWord());
        System.out.println("*** Result:");
        ApplicationWorkers.stringReverserLambda(dataInput.getWord());

        System.out.println(System.lineSeparator() + "✅ process completed correctly");
    }
}
