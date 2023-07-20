// to check wheather that the char is vowel or not in java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        boolean isVowel = "AEIOUaeiou".indexOf(ch) != -1;
        System.out.println(ch + " is " + (isVowel ? "" : "not ") + "a vowel.");
        scanner.close();
    }
}

