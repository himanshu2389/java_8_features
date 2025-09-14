package lambda.apis_effectively;
import java.util.concurrent.CompletableFuture;
//Example: Using CompletableFuture to Call an API Asynchronously

/**
 * Demonstrates how to make asynchronous API calls using CompletableFuture in Java.
 * This approach allows non-blocking execution, improving efficiency.
 */
public class ApiCallExample {
    public static void main(String[] args) {

        // Simulating an API call asynchronously
        // Initiating an asynchronous API call using CompletableFuture
        CompletableFuture.supplyAsync(() -> fetchDataFromAPI())
                .thenAccept(response -> System.out.println("API Response: " + response));

        // Simulating other tasks while the API call is being processed
        System.out.println("Doing other work...");
    }

    /**
     * Simulates fetching data from an API.
     * Introduces a delay to mimic network latency.
     *
     * @return Simulated API response as a string
     */
    public static String fetchDataFromAPI() {
        try {
            Thread.sleep(2000); // Simulating network delay of 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle interruption exception
        }
        return "API Data"; // Simulated API response
    }
}

//  CompletableFuture enables efficient and non-blocking API calls, improving application responsiveness.
// Lambda makes API calls efficient by handling asynchronous responses in a concise way.
