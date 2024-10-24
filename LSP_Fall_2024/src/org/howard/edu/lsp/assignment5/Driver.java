package org.howard.edu.lsp.assignment5;

/**
 * Driver class for testing the IntegerSet implementation.
 * This class contains the main method to demonstrate set operations.
 * Assignments for LSP Course for Fall 2024 semester.
 */
public class Driver {
    /**
     * Default constructor for the Driver class.
     */
    public Driver() {
        // Default constructor
    }
    /**
     * The main method that serves as the entry point for the program.
     * This method will test and demonstrate various operations on IntegerSet.
     * 
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Create two sets
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1: " + set1.toString());
        System.out.println("Smallest value in Set1: " + set1.smallest());
        System.out.println("Largest value in Set1: " + set1.largest());

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2: " + set2.toString());

        // Union of set1 and set2
        System.out.println("Union of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Intersection of set1 and set2
        System.out.println("Intersection of Set1 and Set2");
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

        // Difference between set1 and set2
        System.out.println("Difference between Set1 and Set2");
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2: " + set1.toString());

        // Check if set1 is empty
        System.out.println("Is Set1 empty? " + set1.isEmpty());

        // Clear set1
        set1.clear();
        System.out.println("Set1 after clearing: " + set1.toString());
    }
}

