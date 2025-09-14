package lambda.secondCode;

import java.util.ArrayList;
import java.util.List;

public class WithOutLambda {

    // More Readable, Maintainable, and Concise Code
//Example: Filtering a List Without Lambda

    /**
     * Demonstrates filtering a list without using lambda expressions.
     * This approach uses a traditional loop, making the code longer and less readable.
     */

    public List<String> withOutLambda( List<String> names){
            List<String> filteredNames = new ArrayList<>();

            // Iterating through the list and filtering names that start with "A"
            for (String name : names) {
                if (name.startsWith("A")) {
                    filteredNames.add(name);
                }
            }

            // Printing the filtered list
           // System.out.println(filteredNames);

        return filteredNames;
        }
    }


