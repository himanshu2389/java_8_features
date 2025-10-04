package functional_interface;
// Implementing Functional Interface Using Lambda

public class FunctionalInterfaceExample {

        public static void main(String[] args) {
        // Using Lambda Expression
        MyFunctionalInterface messagePrinter = message -> System.out.println("Message: " + message);

        // Calling the method
        messagePrinter.showMessage("Hello, Java !");
    }

}

// Lambda makes the code concise and eliminates the need for an anonymous class implementation.