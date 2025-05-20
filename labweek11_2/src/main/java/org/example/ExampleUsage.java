package org.example;

/**
 * Practical loop usage examples.
 */
public class ExampleUsage {

    /**
     * Displays even numbers from an array.
     */
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    /**
     * Sums an array of integers.
     *
     * @return the total sum
     */
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    /**
     * Processes a 3x3 matrix and prints each element.
     */
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
}
