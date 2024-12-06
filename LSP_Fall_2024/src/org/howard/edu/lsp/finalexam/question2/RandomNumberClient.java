package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to demonstrate the RandomNumberService.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Using Java's built-in random generator
        service.setGenerator(new JavaRandomGenerator());
        System.out.println("Random number using Java's Random: " + service.generateRandomNumber());

        // Using custom random generator
        service.setGenerator(new CustomRandomGenerator());
        System.out.println("Random number using Custom Generator: " + service.generateRandomNumber());
    }
}
