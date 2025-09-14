package anonymousClass;
interface Animal {
    default void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class ExampleAnonymousInterface {
    public static void main(String[] args) {
        // Case 1: Default method only
        Animal a = new Animal() {};
        a.sound(); // Output: Animal makes a sound

        // Case 2: Override only
        Animal dog1 = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dog barks");
            }
        };
        dog1.sound(); // Output: Dog barks

        // Case 3: Both default + override
        Animal dog2 = new Animal() {
            @Override
            public void sound() {
                Animal.super.sound();
                System.out.println("Dog barks");
            }
        };
        dog2.sound();
        // Output:
        // Animal makes a sound
        // Dog barks
    }
}


