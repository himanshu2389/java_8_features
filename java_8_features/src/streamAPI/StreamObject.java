package streamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// ==================== Second Class (StreamObject) with Proper Comment ==================

public class StreamObject {
    public static void main(String[] args) {
        //Stream API - Collection process
        //collection /group of object

        //1- blank
        //=========================================
        // 1. Creating a blank Stream (empty stream)
        //=========================================
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e ->{
            System.out.println("Empty Stream "+e);
        });

        // 1. Empty Stream

        emptyStream.forEach(System.out::println);

        System.out.println("**------------------------**");
        //2 -array,Object,collection
        //=========================================
        // 2. Creating a Stream from an array
        //=========================================

        String name[] = {"Ram","Shyam","Gheta","Babita","Kumar"};

        Stream<String> stream1= Stream.of(name);
        stream1.forEach(e ->{
            System.out.println(e);
        });
        System.out.println("**------------------------**");


        //=========================================
        // 3. Creating a Stream using Stream.builder()
        //=========================================
        Stream<Object> streamBuilder = Stream.builder().build();
        // This will not print anything because no data is added to the builder
        System.out.println("**------------------------**");


        //=========================================
        // 4. Creating a Stream from an Array using Arrays.stream()
        //=========================================
        IntStream stream = Arrays.stream(new int[]{2,5,6,9,34,67});
        stream.forEach(e ->{
            System.out.println(e);
        });
        System.out.println("**------------------------**");


        //=========================================
        // 5. Creating a Stream from a List
        //=========================================

        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list2.add(78);
        list2.add(14);
        list2.add(19);

        Stream<Integer> streamList = list2.stream();
        streamList.forEach(e ->{
            System.out.println(e);
        });
        System.out.println("**------------------------**");

        //=========================================
        // BONUS EXAMPLE: Stream with filter and map
        //=========================================

        // 1. Applying filter and map together
        System.out.println("Applying filter and map together:");
        list2.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2) // Multiplying each even number by 2
                .forEach(System.out::println);



        // 2. Array to Stream
        String[] arr = {"Java", "Python", "C++"};
        Stream<String> arrayStream = Arrays.stream(arr);
        arrayStream.forEach(System.out::println);

        // 3. List to Stream
        List<String> list = List.of("Aman", "Ankit", "Raj");
        list.stream().forEach(System.out::println);

        // 4. Stream.of()
        Stream<String> streamOf = Stream.of("Apple", "Banana", "Mango");
        streamOf.forEach(System.out::println);

        // 5. Stream.builder()
        Stream<Object> builderStream = Stream.builder()
                .add("John")
                .add("Mike")
                .build();
        builderStream.forEach(System.out::println);
    }
}
