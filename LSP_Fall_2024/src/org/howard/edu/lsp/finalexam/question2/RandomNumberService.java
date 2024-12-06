package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for providing random number generation.
 */
public class RandomNumberService {
    private static RandomNumberService instance = null;
    private RandomNumberGenerator generator;

    /**
     * Private constructor to prevent instantiation.
     */
    private RandomNumberService() {
    }

    /**
     * Returns the singleton instance of RandomNumberService.
     * 
     * @return the singleton instance
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generator strategy.
     * 
     * @param generator the random number generator to use
     */
    public void setGenerator(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    /**
     * Generates a random number using the current strategy.
     * 
     * @return a random positive integer
     */
    public int generateRandomNumber() {
        if (generator == null) {
            throw new IllegalStateException("RandomNumberGenerator strategy is not set.");
        }
        return generator.generateRandomNumber();
    }
}
