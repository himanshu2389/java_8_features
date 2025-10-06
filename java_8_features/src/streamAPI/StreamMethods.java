package streamAPI;


import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        //filter(Predicate) boolean value funtion
        //e->e>10

        //map(function)
        /*
        each element operation
         */

        //===============================================
        // 1. filter() Method
        //===============================================
        // filter() is a predicate method which returns a boolean value.
        // It is used to filter elements based on a condition.
        // Example: Filter names starting with 'A'
        List<String> namesList = List.of("Aman","Ankit","During","Raj","Vikram");
        List<String> newNamesList = namesList.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + newNamesList);

        //===============================================
        // 2. map() Method
        //===============================================
        // map() is used to perform operations on each element of the stream.
        // Example: Square of each number
        List<Integer> numberList = List.of(2, 3, 15, 12, 23, 26, 56, 76, 45);

        List<Integer> newNumberList =numberList.stream().map(i ->i*i).collect(Collectors.toList());
        System.out.println("Square of each number: " + newNumberList);


        // map() is used to transform elements
        List<String> upperCaseNames = namesList.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Names in Upper Case: " + upperCaseNames);


        //============================ 3. forEach() Method ============================

        // forEach() is a terminal operation that is used to iterate over elements.
        // It can be used with lambda expression or method reference.
        System.out.println("Printing Names using forEach():");

        namesList.stream().forEach(e ->{
            System.out.println(e);
        });  // Using Lambda
        //We can also write this
        // namesList.stream().forEach(e -> System.out.println(e)); // Using Lambda

        namesList.stream().forEach(System.out::println);// Using Method Reference

        //============================ 4. sorted() Method ============================
        // sorted() method is used to sort the elements in natural order.
        // Example: Sorting numbers
        System.out.println("Sorted Numbers:");
        numberList.stream().sorted().forEach(System.out::println);

        System.out.println("Sorted NamesList :");
        List<String> sortedNames = namesList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        //===============================================
        // 5. min() Method
        //===============================================
        // min() method is used to find the minimum element based on comparator.
        // Example: Finding the minimum value in the list
        Integer minVal = numberList.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min Value "+minVal);


        //===============================================
        // 6. max() Method
        //===============================================
        // max() method is used to find the maximum element based on comparator.
        // Example: Finding the maximum value in the list
        Integer maxVal = numberList.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max Value "+maxVal);

        //===============================================
        // 7. count() Method
        //===============================================
        // count() method is used to count the number of elements in the stream.
        long count = numberList.stream().count();
        System.out.println("Count of numbers: " + count);

        //===============================================
        // 8. allMatch() Method
        //===============================================
        // allMatch() method checks if all elements satisfy a condition.
        boolean allMatch = numberList.stream().allMatch(i -> i > 1);
        System.out.println("All numbers > 1: " + allMatch);

        //===============================================
        // 9. anyMatch() Method
        //===============================================
        // anyMatch() method checks if any element satisfies a condition.
        boolean anyMatch = numberList.stream().anyMatch(i -> i > 50);
        System.out.println("Any number > 50: " + anyMatch);

        //===============================================
        // 10. noneMatch() Method
        //===============================================
        // noneMatch() method checks if no element satisfies a condition.
        boolean noneMatch = numberList.stream().noneMatch(i -> i < 0);
        System.out.println("No number < 0: " + noneMatch);

        //===============================================
        // 11. reduce() Method
        //===============================================
        // reduce() is used to combine elements to produce a single result.
        // Example: Sum of all numbers
        int sum = numberList.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all numbers: " + sum);

        //===============================================
        // 12. distinct() Method
        //===============================================
        // distinct() method removes duplicate elements.
        List<Integer> distinctNumbers = List.of(2, 3, 15, 12, 23, 2, 56, 45, 76, 45);
        System.out.println("Distinct Numbers:");
        distinctNumbers.stream().distinct().forEach(System.out::println);


    }
}
