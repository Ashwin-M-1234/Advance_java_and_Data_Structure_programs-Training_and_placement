
import java.util.Scanner;
	public class Frequencycheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Prompt user to enter the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        // Step 3: Create the array
	        int[] array = new int[size];

	        // Step 4: Prompt user to enter the elements of the array
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }

	        // Step 6: Check frequency of each element
	        System.out.println("Element Frequency:");
	        for (int i = 0; i < size; i++) {
	            int count = 1;
	            // Check frequency of array[i]
	            for (int j = i + 1; j < size; j++) {
	                if (array[i] == array[j]) {
	                    count++;
	                }
	            }
	            // Avoid counting the same element again
	            if (count > 0) {
	                System.out.println(array[i] + " occurs " + count + " time(s).");
	            }
	        }
	    }
	}
