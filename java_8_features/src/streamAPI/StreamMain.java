package streamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {


        //Q) Create a list and Filter all even numbers from list

        // Creating an immutable list using List.of()
        // Immutable list means we cannot add or remove elements after creation
        List<Integer> list1 = List.of(2, 3, 15, 12, 23, 26, 56, 76, 45);
        // list1.add(123); --> This will give an error because List.of() creates an immutable list
        System.out.println("Original List: " + list1);

        // Creating a mutable list using ArrayList
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list2.add(78);
        list2.add(14);
        list2.add(19);

        // Creating a list using Arrays.asList()

        List<Integer> list3 =  Arrays.asList(23,45,26,67,58);

        //==========================================================
        // Filtering even numbers without using Stream API
        // This is traditional approach (boilerplate code)
        //==========================================================
        List<Integer> listEven = new ArrayList<>();

        for (Integer i:list1) {
            if(i % 2==0){
                listEven.add(i);
            }

        }
        System.out.println(list1);
        System.out.println("List after filtering Even numbers without Stream API:");
        System.out.println(listEven);


        //==========================================================
        // Filtering even numbers using Stream API
        // Stream API makes the code concise and easy to read
        //==========================================================
        System.out.println("\n**------------Stream API Example------------**");

        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers using Stream API: " + newList);

        // Stream API in one line
        System.out.println("**------------Stream In One Line------------**");
        List<Integer> newList2= list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers in one line: " + newList2);

        System.out.println("**------------Stream In One Line greater then 1o------------**");
        // Filtering numbers greater than 10

        List<Integer> newList3= list1.stream().filter(i -> i >10).collect(Collectors.toList());

        System.out.println("Numbers greater than 10: " + newList3);

        System.out.println("**------------Stream List with numbers greater than 15:------------**");

        System.out.println(list1.stream().filter(i -> i >15).collect(Collectors.toList()));
    }
}

