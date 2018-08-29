import java.util.Random;
abstract class Compartment
{
    abstract void notice();
}
class FirstClass extends Compartment
{
    void notice()
    {
        System.out.println("FirstClass");
    }
}
class Ladies extends Compartment
{
    void notice()
    {
        System.out.println("Ladies");
    }
}
class General extends Compartment
{
    void notice()
    {
        System.out.println("General");
    }
}
class Luggage extends Compartment
{
    void notice()
    {
        System.out.println("Luggage");
    }
}
public class Main
{
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
	public static void main(String[] args) {
	    Compartment[] ar=new Compartment[10];
	    for(int i=0;i<10;i++)
	    {
	        int j=randomNumberInRange(1,4);
	        switch(j)
	        {
	            case 1: ar[i]=new FirstClass();
	                    break;
	            case 2: ar[i]=new Ladies();
	                    break;
	            case 3: ar[i]=new General();
	                    break;
	            case 4: ar[i]=new Luggage();
	                    break;
	        }
	        ar[i].notice();
	    }
	}
}
