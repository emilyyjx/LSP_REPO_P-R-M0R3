package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestIntegerSet {
    
    @Test
    @DisplayName("Test clear method")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test length method")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length());
        set.add(1);
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test equals method")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test contains method")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        assertTrue(set.contains(3));
    }

    @Test
    @DisplayName("Test largest method with exception")
    public void testLargest() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(5);
        assertEquals(5, set.largest());

        set.clear();
        assertThrows(IntegerSetException.class, set::largest);
    }

    @Test
    @DisplayName("Test smallest method with exception")
    public void testSmallest() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(4);
        assertEquals(1, set.smallest());

        set.clear();
        assertThrows(IntegerSetException.class, set::smallest);
    }

    @Test
    @DisplayName("Test add method")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        assertTrue(set.contains(5));
    }

    @Test
    @DisplayName("Test remove method")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.remove(3);
        assertFalse(set.contains(3));
    }

    @Test
    @DisplayName("Test union method")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2));
    }

    @Test
    @DisplayName("Test intersect method")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test diff method")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.contains(1));
    }

    @Test
    @DisplayName("Test complement method")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.complement(set2);
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test isEmpty method")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test toString method")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }
}
