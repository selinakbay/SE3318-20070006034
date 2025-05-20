package org.example;

/**
 * Main class to demonstrate loop control and proper coding practices.
 */
public class App {
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();
        ExampleUsage exampleUsage = new ExampleUsage();

        System.out.println("Demonstrating correct variable usage:");
        loopControl.correctVariableUsage();

        System.out.println("\nDemonstrating incorrect variable usage:");
        loopControl.incorrectVariableUsage();

        System.out.println("\nDemonstrating safe empty block handling:");
        loopControl.avoidEmptyBlock();

        System.out.println("\nDemonstrating correct loop control usage:");
        loopControl.correctlyModifiedControlVariable();

        System.out.println("\nDemonstrating incorrect loop control modification:");
        loopControl.modifiedControlVariable();

        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
