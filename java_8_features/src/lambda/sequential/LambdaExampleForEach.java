package lambda.sequential;

import java.util.Arrays;
import java.util.List;
// Sequential and Parallel Execution Support
//Example: Using forEach for Sequential Execution

public class LambdaExampleForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Sequential Execution (Default)
        names.forEach(name -> System.out.println(name));
    }
}



