package lambda.secondCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// More Readable, Maintainable, and Concise Code
//Example: Filtering a List With Lambda (More Readable)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates filtering a list using lambda expressions and the Stream API.
 * This approach is more concise, readable, and maintainable.
 */
public class WithLambda {

    public List<String> withLambda( List<String> str){

        // Using Lambda + Stream API to filter names starting with "A"
        List<String> result = new ArrayList<>();

        result = str.stream()
                .filter(name -> name.startsWith("A")) // Using Lambda name -> name.startsWith("A")

                .collect(Collectors.toList());

        // Printing the filtered list
       // System.out.println(result);
        return result;
    }

}

//  Lambda expressions improve readability, maintainability, and conciseness by leveraging functional programming principles.
// Lambda makes code more readable, maintainable, and concise by leveraging functional programming.








