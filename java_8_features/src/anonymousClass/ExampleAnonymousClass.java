package anonymousClass;
class Car{
    void sound() {
        System.out.println("Car makes a sound");
    }
}
public class ExampleAnonymousClass {
    public static void main(String[] args) {
        // Case 1: Parent method only
        System.out.println();
        System.out.println("***  Parent method only ***");
        Car car= new Car(){};
        car.sound();
        System.out.println();
        System.out.println("*** Child method only ***");
        // Case 2: Child method only
        Car car1 = new Car(){
            @Override
            void sound(){
                System.out.println("Old Car Sound");
            }
        };

        car1.sound();;
        System.out.println();
        System.out.println("***  Both parent + child ***");

        // Case 3: Both parent + child
        Car car3 = new Car(){

            @Override
            void sound(){
                super.sound();
                System.out.println("Old Car Sound");

            }
        };

        car3.sound();
    }
}
