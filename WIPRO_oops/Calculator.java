class Calculator
{
    static int powerInt(int num1,int num2)
    {
        int a=1;
        for(int i=1;i<=num2;i++)
            a*=num1;
        return a;
    }
    static double powerDouble(double num1,int num2)
    {
        double a=1;
        for(int i=1;i<=num2;i++)
            a*=num1;
        return a;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("FIrst is  "+Calculator.powerInt(2,5)+"\nSecond is "+(float)Calculator.powerDouble(1.1,2));
	}
}
