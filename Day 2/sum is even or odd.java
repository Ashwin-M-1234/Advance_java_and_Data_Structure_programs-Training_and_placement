import java.util.*;
public class sum_even_or_odd 
{
  public static void main (String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a + b;
    if (c % 2 == 0) 
    {
      System.out.println(c + " is even");
    } 
    else 
    {
      System.out.println(c + " is even");
    }
    sc.close();
  }
}
