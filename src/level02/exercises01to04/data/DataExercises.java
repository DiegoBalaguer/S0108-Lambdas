package level02.exercises01to04.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * PROGRAM: DataExercises
 * AUTHOR: Diego Balaguer
 * DATE: 01/05/2025
 */

public class DataExercises {

    public List<String> getListNames() {
        return Arrays.asList("Alice", "Ana", "Bob", "Ali", "Andrew", "Ann", "Eve", "Adrian", "Amy", "Mike", "Arthur", "Ada", "Oscar", "Angela", "John");
    }

    public List<Integer> getListIntegers() {
        return Arrays.asList(124, 783, 506, 905, 812, 141, 726, 919, 1020, 333);
    }

    public float getFloatNumber01() {
        return 25f;
    }

    public float getFloatNumber02() {
        return 8f;
    }

    public List<String> getListObjects() {
        List<Object> objectsList = Arrays.asList("Orange", 20525, "Computer",7990,  7980, 7950, "Ana", 3580, "Energizer", 18, "World", 658, "Two", 958304);
        return objectsList.stream().map(o -> o.toString()).collect(Collectors.toList());
    }
}
