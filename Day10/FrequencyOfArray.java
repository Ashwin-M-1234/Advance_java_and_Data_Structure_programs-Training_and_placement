import java.util.Arrays;
import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		int n, i, j, count;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");      // entering the size of array 
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] freq = new int[n];
		Arrays.fill(freq, -1);
		System.out.format("Enter Frequency Array %d elements : ", n );   // entering the elements of array 
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(i = 0; i < arr.length; i++){
			count = 1;
			for(j = i + 1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					freq[j] = 0;
				}
			}
			if(freq[i] != 0){
				freq[i] = count;
			}
		}
		System.out.println("The Frequency of All the Elements in this Array ");
		
		for(i = 0; i < arr.length; i++) {
			if(freq[i] != 0){
				System.out.println(arr[i] + " Occurs " + freq[i] + " Times.");
			}
		}
	}
}
