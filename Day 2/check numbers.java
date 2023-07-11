import java.util.*;
import java.io.*;
public class check_number 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter an integer : ");
    int n = sc.nextInt();
    if (n > 0) 
    {
      System.out.println(n + " is positive");
    } 
    else if (n < 0) 
    {
      System.out.println(n + " is negative");
    }
    else 
    {
      System.out.println(n + " is zero");
    }
  }
}
