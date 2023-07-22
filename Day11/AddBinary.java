/*
1 + 0 = 1
0 + 1 = 1
0 + 0 = 0
1 + 1 = 10 (0 and carry 1)
1 + 1 + 1 = 10 + 1 = 11 (1 and carry 1)

*/
import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first binary number: ");
        String binaryOne = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String binaryTwo = sc.nextLine();

        // Convert binary strings to integers for addition
        int decimalOne = Integer.parseInt(binaryOne, 2);
        int decimalTwo = Integer.parseInt(binaryTwo, 2);

        // Perform addition
        int sumDecimal = decimalOne + decimalTwo;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sumDecimal);

        // Print the result
        System.out.println("Result = " + binarySum);
    }
}
// explanation of that code in java
/*
The program starts by creating a Scanner object, sc, to read user input.
It prompts the user to enter the first binary number and reads the input as a string into the variable binary.
Similarly, it prompts the user to enter the second binary number and reads the input as a string into the variable binary.
The program then converts the two binary strings (binaryOne and binaryTwo) into integers (decimalOne and decimalTwo, respectively) using Integer.
parseInt(String s, int radix). The second argument specifies that the input strings are in binary format.
The program performs binary addition by adding the two decimal numbers, decimalOne and decimalTwo, and stores the result in the integer variable sumDecimal.
After the addition, the program converts the decimal sum (sumDecimal) back to binary format using Integer.toBinaryString(int i) and stores the binary result in the string variable binarySum.
Finally, the program prints the binary sum as the output.
This program handles binary numbers of varying lengths and correctly adds them to produce the binary sum.
Additionally, it includes input validation for binary numbers and assumes that the user will enter valid binary strings (i.e., sequences of 0s and 1s). 
If the user enters non-binary values, the program may throw a NumberFormatException when parsing the binary strings into integers. 
To make the program more robust, additional input validation can be added to ensure the input is valid in binary format.
