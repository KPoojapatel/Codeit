package interviewprep;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array: ");

        // Read the user's input as an integer
        int size = scanner.nextInt();

        // Create a new array with the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");

        // Read each element of the array from the user
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize the maximum element to be the first element of the array
        int max = array[0];

        // Loop through each element of the array and update the maximum element if necessary
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the maximum element to the console
        System.out.println("Maximum element: " + max);
    }
}


