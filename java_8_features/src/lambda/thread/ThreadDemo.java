package lambda.thread;



/**
 * This class demonstrates the creation and execution of multiple threads using lambda expressions.
 * It creates two separate threads that perform different tasks concurrently.
 */
public class ThreadDemo {
    public static void main(String[] args) {

        /**
         * First Thread: "JAY"
         * This thread prints numbers from 1 to 10, pausing for 0.5 seconds between each iteration.
         */
        Runnable thread1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value of i is " + i);
                try {
                    Thread.sleep(500); // Pause for 0.5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace(); // Print exception details if interrupted
                }
            }
        };

        // Creating and starting Thread JAY

        Thread t1 = new Thread(thread1);
        t1.setName("JAY");
        t1.start();

        /**
         * Second Thread: "Ved"
         * This thread prints the multiplication table of 2, pausing for 1 second between each iteration.
         */
        Runnable thread2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Table of 2 = 2 * " + i + " = " + (i * 2));
                try {
                    Thread.sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace(); // Print exception details if interrupted
                }
            }
        };

        // Creating and starting Thread Ved
        Thread t2 = new Thread(thread2);
        t2.setName("Ved");
        t2.start();
    }
}
