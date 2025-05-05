package level01.exercises01to08.application;

import level01.exercises01to08.interfaces.PiValue;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * PROGRAM: AplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationWorkers {

    public static void arrayWithChar(List<String> inputList, String inputString) {
        showFormattedList(
                inputList.stream()
                        .filter(searchString -> searchString.toUpperCase().contains(inputString.toUpperCase()))
                        .collect(Collectors.toList()));
    }

    public static void arrayWithCharAndLength(List<String> inputList, String inputString, int inputLength) {
        showFormattedList(
                inputList.stream()
                        .filter(searchString -> searchString.toUpperCase().contains(inputString.toUpperCase()) && searchString.length() > inputLength)
                        .collect(Collectors.toList()));
    }

    public static void showListMonthsLambda(List<String> monthsList) {
        monthsList.forEach(month -> System.out.println(month));
    }

    public static void showListMonthsMethodReference(List<String> monthsList) {
        monthsList.forEach(System.out::println);
    }

    public static void showPiValue() {
        PiValue pi = () -> 3.1415;
        System.out.println("Pi Value: " + pi.getPiValue());
    }

    public static void orderedMixedListSortToLong(List<Object> inputList) {
        showFormattedList(
                inputList.stream()
                        .sorted(Comparator.comparingInt(obj -> obj.toString().length()))
                        .collect(Collectors.toList()));
    }

    public static void orderedMixedListLongToSort(List<Object> inputList) {
        showFormattedList(inputList.stream()
                .sorted(Comparator.comparingInt(obj -> obj.toString().length()).reversed())
                .collect(Collectors.toList()));
    }

    public static void stringReverserLambda(String inputString) {
        System.out.println(((Function<String, String>)
                s -> new StringBuilder(s).reverse().toString()
        ).apply(inputString));
    }

    private static void showFormattedList(List<?> inputList) {
        String formatted = inputList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(formatted);
    }
}
