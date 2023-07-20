// Add two complex numbers in java

class ComplexNum 
{
    double real;
    double imaginary;
    ComplexNum(double r, double i) 
    { 
      real = r; 
      imaginary = i; 
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        ComplexNum num1 = new ComplexNum(3.5, 2);
        ComplexNum num2 = new ComplexNum(1.5, 4.5);
        ComplexNum sum  = new ComplexNum(num1.real + num2.real, num1.imaginary + num2.imaginary);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
    }
}

