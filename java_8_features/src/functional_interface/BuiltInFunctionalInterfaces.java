package functional_interface;


import java.util.function.*;

//Code Explanation: Using Built-in Functional Interfaces
public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Predicate: Checks if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(11)); // false

        // Function: Converts String to Integer (length)
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println(lengthFunction.apply("Lambda")); // 6

        // Consumer: Prints a message
        Consumer<String> printMessage = msg -> System.out.println("Message: " + msg);
        printMessage.accept("Hello!");

        // Supplier: Provides a random number
        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());
    }
}
//✅ Built-in functional interfaces provide ready-made solutions for common use cases.


/**

 1. Predicate<T> – Tests a condition and returns true or false

 Predicate<Integer> isEven = n -> n % 2 == 0;
 System.out.println(isEven.test(10)); // true
 Purpose: Predicate is used for conditions (e.g., checking if a number is even).
 Lambda Expression: n -> n % 2 == 0 (Returns true if n is even).
 Example: isEven.test(10) → Returns true because 10 is even.
 */

/**
 2. Function<T, R> – Accepts an input and returns an output

 Function<String, Integer> lengthFunction = str -> str.length();
 System.out.println(lengthFunction.apply("Lambda")); // 6
 Purpose: Function<T, R> transforms data from one type to another.
 Lambda Expression: str -> str.length() (Calculates the length of a string).
 Example: lengthFunction.apply("Lambda") → Returns 6 because "Lambda" has 6 characters.
 */
/**
 3. Consumer<T> – Accepts an input but does not return a value

 Consumer<String> printMessage = msg -> System.out.println("Message: " + msg);
 printMessage.accept("Hello!");
 Purpose: Consumer is used for operations that do not return a value (e.g., printing).
 Lambda Expression: msg -> System.out.println("Message: " + msg) (Prints a message).
 Example: printMessage.accept("Hello!") → Prints "Message: Hello!".
 */
/**
 4. Supplier<T> – Provides a value without any input

 Supplier<Double> randomValue = Math::random;
 System.out.println(randomValue.get());
 Purpose: Supplier generates values when needed (e.g., random numbers).
 Lambda Expression: Math::random (Generates a random number).
 Example: randomValue.get() → Returns a random value like 0.435729.
 */
/**
 * Output Example
 *
 * true
 * 6
 * Message: Hello!
 * 0.847382 (Random output will vary)
 *
 *  */
/**
 * ✅ Summary
 *
 * Predicate<T> → Checks conditions (returns true/false).
 * Function<T, R> → Transforms input (T) into output (R).
 * Consumer<T> → Performs an operation (does not return anything).
 * Supplier<T> → Provides a value without input.
 */