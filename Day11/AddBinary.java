/*
1 + 0 = 1
0 + 1 = 1
0 + 0 = 0
1 + 1 = 10 (0 and carry 1)
1 + 1 + 1 = 10 + 1 = 11 (1 and carry 1)

*/
import java.util.Scanner;

public class BinaryAdd
{
   public static void main(String[] args)
   {
      int binaryOne, binaryTwo;
      int remOne, remTwo, sumDigit, i=0, carry=0;
      int[] sum = new int[10];
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Two Binary Numbers: ");
      binaryOne = sc.nextInt();
      binaryTwo = sc.nextInt();
      
      while(binaryOne!=0 || binaryTwo!=0)		// using OR operator 
      {
         sum[i++] = ((binaryOne%10 + binaryTwo%10 + carry)%2);
         carry = ((binaryOne%10 + binaryTwo%10 + carry)/2);
         binaryOne /= 10;
         binaryTwo /= 10;
      }
      if(carry==1)
         sum[i] = carry;
      System.out.print("\nResult = ");
      while(i>=0)
         System.out.print(sum[i--]);
   }
}
