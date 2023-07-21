// compound intrest = A - p
// A = (p*(1+(r/n))^(t*n))
// to calculate the compound interest
import java.util.Scanner;
public class CompoundIntrest {
  public static void main(String[] args) {

    // create an object of Scanner class
    Scanner sc = new Scanner (System.in);

    // take input from users
    System.out.print("Enter the principal: ");
    double p = sc.nextDouble();

    System.out.print("Enter the rate: ");
    double r = sc.nextDouble();

    System.out.print("Enter the time: ");
    double t = sc.nextDouble();

    System.out.print("Enter number of times interest is compounded: ");
    int n = sc.nextInt();

    double A = p * (Math.pow((1 + r/100), (t*n))) - p;

    System.out.println("Principal: " + p);
    System.out.println("Interest Rate: " + r);
    System.out.println("Time Duration: " + t);
    System.out.println("Number of Time interest Compounded: " + n);
    System.out.println("Compound Interest: " + i);

    sc.close();
  }
}
