package lambda.sequential;

import java.util.Arrays;
import java.util.List;
// Sequential and Parallel Execution Support
//Example: Using Parallel Stream for Parallel Execution
public class LambdaExamplePSPE {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Parallel Execution using parallelStream()
        names.parallelStream().forEach(name -> System.out.println(name + " - " + Thread.currentThread().getName()));
    }
}
// Lambda enables behavior to be passed as an argument, making sequential and parallel execution simple.