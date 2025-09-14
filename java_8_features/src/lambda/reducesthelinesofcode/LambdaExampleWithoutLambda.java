package lambda.reducesthelinesofcode;

import java.util.*;
// Reduces the Lines of Code
//Before (Without Lambda - Anonymous Class Approach):

/**
 * Demonstrates sorting a list using an anonymous class.
 * This approach does not use lambda expressions, resulting in more boilerplate code.
 */
public class LambdaExampleWithoutLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Sorting using an Anonymous Class (Before Java 8 approach)
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // Printing the sorted list
        System.out.println(names);
    }
}

