package interviewprep;
import java.util.Scanner;

public class Exercise2 {
	
	    public static void main(String[] args) {
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.println("Enter a string: ");

	        // Read the user's input as a string
	        String original = scanner.nextLine();

	        // Initialize an empty string to hold the reversed string
	        String reversed = "";

	        // Loop through each character of the original string in reverse order
	        for (int i = original.length() - 1; i >= 0; i--) {
	            // Add the current character to the reversed string
	            reversed += original.charAt(i);
	        }

	        // Print the reversed string to the console
	        System.out.println("Reversed string: " + reversed);
	    }
	}



