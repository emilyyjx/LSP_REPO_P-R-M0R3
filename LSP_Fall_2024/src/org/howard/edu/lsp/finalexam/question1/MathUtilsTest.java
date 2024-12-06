package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();

    // Factorial Tests
    @Test
    void testFactorialOfZero() {
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    void testFactorialOfNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1),
                "Factorial of negative numbers should throw IllegalArgumentException");
    }

    // Prime Number Tests
    @Test
    void testIsPrimeWithPrimeNumber() {
        assertTrue(mathUtils.isPrime(7), "7 should be prime");
    }

    @Test
    void testIsPrimeWithNonPrimeNumber() {
        assertFalse(mathUtils.isPrime(10), "10 should not be prime");
    }

    @Test
    void testIsPrimeWithEdgeCase() {
        assertFalse(mathUtils.isPrime(1), "1 should not be prime");
        assertFalse(mathUtils.isPrime(0), "0 should not be prime");
        assertFalse(mathUtils.isPrime(-5), "-5 should not be prime");
    }

    // GCD Tests
    @Test
    void testGCDOfTwoPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    void testGCDWithOneZeroInput() {
        assertEquals(5, mathUtils.gcd(0, 5), "GCD of 0 and 5 should be 5");
        assertEquals(7, mathUtils.gcd(7, 0), "GCD of 7 and 0 should be 7");
    }

    @Test
    void testGCDWithBothZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0),
                "GCD of 0 and 0 should throw IllegalArgumentException");
    }
}
