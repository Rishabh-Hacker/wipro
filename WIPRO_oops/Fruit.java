import java.util.Scanner;
class Fruit
{
    private String name,taste;
    private double size;
    void eat()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name");
        name=s.nextLine();
        System.out.println("Enter Taste");
        taste=s.nextLine();
        System.out.println("Enter Size");
        size=s.nextDouble();
    }
    String getName()
    {
        return name;
    }
    String getTaste()
    {
        return taste;
    }
    double getSize()
    {
        return size;
    }
}
class Apple extends Fruit
{
    void eat()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size");
        size=s.nextDouble();
        name="Apple";
        taste="crispness";
    }
}
class Orange extends Fruit
{
    void eat()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size");
        size=s.nextDouble();
        name="Orange";
        taste="sour";
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	}
}
