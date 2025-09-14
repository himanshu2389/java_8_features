package lambda.FirstCode;

/**
 * Concrete class implementing FirstCodeInterface.
 * Provides an implementation for the sayHello() method.
 */
public class FirstCodeImpl implements FirstCodeInterface {

    @Override
    public void sayHello() {
        System.out.println("Inside First Code Interface by impl class");
    }
}
