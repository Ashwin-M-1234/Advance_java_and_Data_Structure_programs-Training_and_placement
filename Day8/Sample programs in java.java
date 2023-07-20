Sample java programs 

// even or odd number finder in java .....
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("It's even.......");
        } else {
            System.out.println("It's odd........");
        }
    }
}


// printing numbers in words of range 1 to 9 in java ......
import java.util.Scanner;
public class PrintNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter ur no (1 to 9 )in it : ");
        int num = sc.nextInt();
        if ( num >= 1 && num <= 9)
        {
            switch(num)
            {
                case 1:
                    {
                        System.out.println(" ONE.....");
                        break;
                    }
                case 2:
                    {
                        System.out.println(" TWO.....");break;
                    }
                case 3:
                    {
                        System.out.println(" three...");break;
                    }
                case 4:
                    {
                        System.out.println(" four....");break;
                    }
                case 5:
                    {
                        System.out.println(" five....");break;
                    }
                case 6:
                    {
                        System.out.println(" six....");break;
                    }
                case 7:
                    {
                        System.out.println(" seven....");break;
                    }
                case 8:
                    {
                        System.out.println(" eight....");break;
                    }
                case 9:
                    {
                        System.out.println(" nine....");break;
                    }
                default :
                    {
                        System.out.println(" invalid number ......");
                    }
            }
        }
        else 
        {
            System.out.println(" enter a value of range 1 to 9 in it .........");
        }
    }
}




