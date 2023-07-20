// Here is the code to find the prime numbers between them 

import java.util.Scanner;
class Prime
{
	public static void main(String arg[])	
	{
	int i,count, num=0;
  System.out.print("Enter n value : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
  System.out.println("Prime numbers between 1 to "+n+" are ");
	for(int j=2;j<=n;j++)
	{
	  count=0;
	  for(i=1;i<=j;i++)
	  {
	     if(j%i==0)
	     {
	        count++;        
	     }
	  }
	  if(count==2)
	  System.out.print(j+"  ");
    num++;     
	}
    System.out.println(num);
	}
}
