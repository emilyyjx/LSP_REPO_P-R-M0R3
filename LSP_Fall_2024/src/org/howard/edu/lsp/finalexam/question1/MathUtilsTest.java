package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MathUtilsTest {

    @Test
    void testFactorial_ValidInput() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(120, mathUtils.factorial(5));
        assertEquals(1, mathUtils.factorial(0));
    }

    private void assertEquals(int i, int factorial) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void testFactorial_NegativeInput() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    private void assertThrows(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		
	}

	private void assertThrows(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void testIsPrime_PrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPrime(7));
        assertTrue(mathUtils.isPrime(13));
    }

    private void assertTrue(boolean prime) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void testIsPrime_NonPrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(4));
        assertFalse(mathUtils.isPrime(1));
    }

    private void assertFalse(boolean prime) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void testGcd_ValidInputs() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(6, mathUtils.gcd(54, 24));
        assertEquals(1, mathUtils.gcd(17, 13));
    }

    @Test
    void testGcd_ZeroInputs() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(10, mathUtils.gcd(0, 10));
        assertEquals(10, mathUtils.gcd(10, 0));
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}
