//Simple intrest 
// simple intrest = (p*n*t) / 100

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // take input from users
    System.out.print("Enter the principal: ");
    double p = sc.nextDouble();

    System.out.print("Enter the rate: ");
    double r = sc.nextDouble();

    System.out.print("Enter the time: ");
    double t = sc.nextDouble();

    double A = (p * t * r) / 100;

    System.out.println("Principal: " + p);
    System.out.println("Interest Rate: " + r);
    System.out.println("Time Duration: " + t);
    System.out.println("Simple Interest: " + A);

    sc.close();
  }
}
