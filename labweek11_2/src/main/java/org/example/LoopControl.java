package org.example;

/**
 * Demonstrates loop control and Checkstyle rule violations/fixes.
 */
public class LoopControl {

    /**
     * Correct usage of variable declarations close to usage.
     */
    public void correctVariableUsage() {
        for (int i = 0; i < 5; i++) {
            int squared = i * i;
            System.out.println("Square of " + i + " is " + squared);
        }
    }

    /**
     * Incorrect usage: variable declared far from usage.
     */
    public void incorrectVariableUsage() {
        int index; // declared early
        System.out.println("Preparing to loop...");
        index = 0;
        for (; index < 5; index++) {
            System.out.println("Index: " + index);
        }
    }

    /**
     * Avoids empty else block violation.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                System.out.print(""); // Non-empty block (safe)
            }
        }
    }

    /**
     * Violation: Modifies control variable inside loop.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Violation: Modifying control variable
                System.out.println("Adjusted to " + m);
            } else {
                System.out.println("m: " + m);
            }
        }
    }

    /**
     * Correct handling of loop logic without modifying control variable.
     */
    public void correctlyModifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Special handling at: " + m);
                continue;
            }
            System.out.println("m: " + m);
        }
    }
}
