package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IntegerSet is a collection of unique integers. 
 * It supports common set operations such as union, intersection, and difference.
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default constructor for IntegerSet. Initializes an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Constructor that accepts an initialized set.
     * @param set an ArrayList of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the set by removing all elements.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the size of the set.
     * @return the number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal.
     * @param o another object to compare to.
     * @return true if both sets contain the same elements, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
        }
        return false;
    }

    /**
     * Checks if the set contains a specific value.
     * @param value the integer value to search for.
     * @return true if the value exists in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * @return the largest integer in the set.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new RuntimeException("The set is empty");
        }
        return Collections.max(set);
    }

    /**
     * Returns the smallest element in the set.
     * @return the smallest integer in the set.
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new RuntimeException("The set is empty");
        }
        return Collections.min(set);
    }

    /**
     * Adds an element to the set. Does nothing if the element is already present.
     * @param item the integer to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an element from the set. Does nothing if the element is not found.
     * @param item the integer to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of the current set with another set.
     * @param intSetb another IntegerSet to perform union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs the intersection of the current set with another set.
     * @param intSetb another IntegerSet to perform intersection with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs the difference of the current set and another set (this - intSetb).
     * @param intSetb another IntegerSet to subtract from the current set.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Finds the complement of the current set with respect to another set.
     * @param intSetb the set to use for complement.
     */
    public void complement(IntegerSet intSetb) {
        intSetb.set.removeAll(set);
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return a string containing the elements of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
