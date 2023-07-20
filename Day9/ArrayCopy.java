import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter the elements of the first array:");

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Copying elements to arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("The elements of the second array (copied from the first array) are:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
