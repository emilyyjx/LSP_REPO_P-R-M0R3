package org.howard.edu.lsp.finalexam.question2;

/**
 * Custom implementation of RandomNumberGenerator using a linear congruential generator algorithm.
 */
public class CustomRandomGenerator implements RandomNumberGenerator {
    private long seed = System.currentTimeMillis();
    private static final long MULTIPLIER = 1664525;
    private static final long INCREMENT = 1013904223;
    private static final long MODULUS = (long) Math.pow(2, 32);

    @Override
    public int generateRandomNumber() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return (int) Math.abs(seed); // Ensure positive integer
    }
}

