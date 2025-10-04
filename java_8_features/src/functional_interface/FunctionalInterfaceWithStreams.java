package functional_interface;


import java.util.Arrays;
import java.util.List;
// Using Functional Interface with Streams
@FunctionalInterface
interface StringFilter {
    boolean check(String str);
}

public class FunctionalInterfaceWithStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using Lambda Expression to filter names starting with "A"
        StringFilter startsWithA = str -> str.startsWith("A");
        StringFilterWithout endWithe = val -> val.endsWith("e");

        names.stream()
                .filter(startsWithA::check)
                .forEach(System.out::println);
        System.out.println("*******************************");

        names.stream().filter(endWithe ::check).forEach(System.out::println);
    }
}
// Functional interfaces work well with Java Streams to simplify operations.