package functional_interface;


import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StringFilterWithout {
    boolean check(String str);
}

public class FunctionalInterfaceWithoutStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using Lambda Expression to filter names starting with "A"
        StringFilterWithout startsWithA = str -> str.startsWith("A");
        StringFilterWithout endWithe = val -> val.endsWith("e");

        // Traditional loop for filtering
        for (String name : names) {
            if (startsWithA.check(name)) {
                System.out.println("names starting with A "+name);
            }
        }

        // Traditional loop for filtering
        for (String name : names) {
            if (endWithe.check(name)) {
                System.out.println("names ending with e "+name);
            }
        }

    }
}
