package level02.exercises01to04.application;

import level02.exercises01to04.interfaces.Operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * PROGRAM: AplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationWorkers {

    public static void namesStartCharAndLength(List<String> inputList, String imputString, int inputLlength) {
        showFormattedList(inputList.stream()
                .filter(name -> name.toUpperCase().startsWith(imputString.toUpperCase()) && name.length() == inputLlength)
                .collect(Collectors.toList()));
    }

    public static void numbersFormated(List<Integer> imputList, String evenString, String oddString) {
        showFormattedList(imputList.stream()
                .map(numberFormat -> (numberFormat % 2 == 0 ? evenString : oddString) + numberFormat)
                .collect(Collectors.toList()));
    }

    public static void showOperationsCalc(float number01, float number02) {
        Operation sum = () -> number01 + number02;
        Operation sub = () -> number01 - number02;
        Operation mul = () -> number01 * number02;
        Operation div = () -> number01 / number02;

        System.out.println("***Sum: " + number01 + " + " + number02 + " = " + sum.operate());
        System.out.println("***Sub: " + number01 + " - " + number02 + " = " + sub.operate());
        System.out.println("***Mul: " + number01 + " * " + number02 + " = " + mul.operate());
        System.out.println("***Div: " + number01 + " / " + number02 + " = " + div.operate());
    }
    public static void orderedObjects(List<String> inputList) {
        System.out.println("*** Sorted alphabetically by the first character:");
        showFormattedList(inputList.stream()
                .sorted(Comparator.comparing(
                        stringSearch -> stringSearch.toUpperCase().charAt(0)))
                .collect(Collectors.toList()));

        System.out.println("*** Sorted with strings containing 'e' first:");
        showFormattedList(inputList.stream()
                .sorted(Comparator
                        .comparing((String s) ->
                                !(s.isEmpty() || s.charAt(0) == 'E' || s.charAt(0) == 'e'))
                        .thenComparing(String::compareToIgnoreCase)
                ).collect(Collectors.toList()));

        System.out.println("*** After replacing 'a' with '4' in strings:");
        showFormattedList(inputList.stream()
                .map(stringData -> stringData.replace('a', '4').replace('A', '4'))
                .collect(Collectors.toList()));

        System.out.println("*** Only numeric elements:");
        showFormattedList(inputList.stream()
                .filter(s -> s.matches("-?\\d+(\\.\\d+)?"))
                .collect(Collectors.toList()));
    }

    private static void showFormattedList(List<?> inputList) {
        String formatted = inputList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(formatted);
    }
}
