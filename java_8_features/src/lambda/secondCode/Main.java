package lambda.secondCode;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WithLambda withLambda= new WithLambda();
        WithOutLambda withOutLambda = new WithOutLambda();
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","Ajax","Tom");

        // Using Lambda + Stream API to filter names starting with "A"
        List<String> withLambdaList = withLambda.withLambda(names);

        // Iterating through the list and filtering names that start with "A"
        List<String> withOutLambdaList = withOutLambda.withOutLambda(names);

        System.out.println("withLambdaList :- " +withLambdaList);
        System.out.println("withOutLambdaList :- "+withOutLambdaList);




    }
}
