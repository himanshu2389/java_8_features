package lambda.reducesthelinesofcode;

// Reduces the Lines of Code

//Before (With Lambda - Anonymous Class Approach):
//After (With Lambda):
/**
 * Demonstrates sorting a list using a lambda expression.
 * This approach is more concise and improves readability.
 */
import java.util.*;

public class LambdaExampleWithLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Sorting using a Lambda Expression (Java 8+ approach)
        // Using Lambda Expression (Concise and Readable)
        names.sort((s1, s2) -> s1.compareTo(s2));
        // Printing the sorted list
        System.out.println(names);
    }
}
// Lambda reduces boilerplate code, making it cleaner and more concise.
//  Lambda expressions reduce boilerplate code, making it cleaner and more concise.

