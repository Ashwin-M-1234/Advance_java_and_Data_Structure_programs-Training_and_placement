public class ConditionalOperatorExample  
{  
public static void main(String args[])   
{  
int x=5, y=4, z=7;  
System.out.println(x>y && x>z || y<z);  
System.out.println((x<z || y>z) && x<y);  
}  
}  