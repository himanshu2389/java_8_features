package optinal_class;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalExample {

    public static  Optional<String> getName(){
        String name = "Himanshu";
        return Optional.ofNullable(name);
    }

    public static Optional<ArrayList<String>> getNameList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");
        list.add("MySQL");
        return Optional.ofNullable(list);

    }

    public static void main(String[] args) {
        String str1 = "java is my favorite";
        String str = null;
        Optional<String> optional= Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        //    System.out.println(optional.get());

        System.out.println(optional.orElse("No Value is this object"));

        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse("Null return"));


        Optional<ArrayList<String>> listOptional = getNameList();

        // check isPresent
        if (listOptional.isPresent()) {
            System.out.println("List Values: " + listOptional.get());
        }


        listOptional.ifPresent(list -> list.forEach(System.out::println));
    }
}
