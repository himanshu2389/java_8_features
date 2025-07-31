package lambda;

/**
 * Main2 class to demonstrate different ways of implementing interfaces in Java 8.
 * It covers:
 * 1. Traditional class implementation
 * 2. Anonymous class implementation
 * 3. Lambda expression implementation
 */
public class FirstCode {
    public static void main(String[] args) {
        System.out.println("First code for lambda expressions");


        // Using a separate class that implements the interface
        FirstCodeInterface fCI = new FirstCodeImpl();
        fCI.sayHello();

        System.out.println();
        System.out.println("***-------------------------------------------------------------***");

        // Implementing the interface using an anonymous class
        FirstCodeInterface fCIAnonymous = new FirstCodeInterface() {
            @Override
            public void sayHello() {
                System.out.println("Inside First Code Interface by Anonymous class");
            }
        };
        fCIAnonymous.sayHello();

        System.out.println();
        System.out.println("***-------------------------------------------------------------***");

        // Implementing the interface using a lambda expression
        FirstCodeInterface fCILambdaExp = () -> {
            System.out.println("Inside First Code Interface by Lambda Expression");
        };
        fCILambdaExp.sayHello();

        System.out.println();
        System.out.println("***-------------------------------------------------------------***");

        // Implementing the SecondInterfaceSum using a lambda expression
        SecondInterfaceSum sumOfTwo = (Integer a, Integer b) -> {
            return a + b;
        };
        System.out.println("Inside Second Interface Sum by Lambda Expression: " + sumOfTwo.sum(10, 20));

        System.out.println();
        System.out.println("***-------------------------------------------------------------***");

        // Optimized lambda expression for sum operation (removing explicit type and braces)
        SecondInterfaceSum sumOfTwoWithRule = (a, b) -> a + b;
        System.out.println("Inside Second Interface Sum by Lambda Expression With Rule of LE: " + sumOfTwoWithRule.sum(100, 200));

        System.out.println();
        System.out.println("***-------------------------------------------------------------***");

        // Implementing the ThirdInterfaceClass using a lambda expression to get string length
        ThirdInterfaceClass thirdInterfaceClass = str -> str.length();
        System.out.println("Inside Third Interface Sum by Lambda Expression With Rule of LE: " + thirdInterfaceClass.getLength("Himanshu"));

    }
}
