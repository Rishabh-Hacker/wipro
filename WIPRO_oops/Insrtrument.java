import java.util.Random;
abstract class Instrument
{
    abstract void play();
}
class Piano extends Instrument
{
    void play()
    {
        System.out.println("Piano is playing tan tan tan");
    }
}
class Flute extends Instrument
{
    void play()
    {
        System.out.println("Flute is playing toot toot toot");
    }
}
class Guitar extends Instrument
{
    void play()
    {
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class Main
{
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
	public static void main(String[] args) {
	    Instrument[] ar=new Instrument[10];
	    for(int i=0;i<10;i++)
	    {
	        int j=randomNumberInRange(1,3);
	        switch(j)
	        {
	            case 1: ar[i]=new Piano();
	                    break;
	            case 2: ar[i]=new Flute();
	                    break;
	            case 3: ar[i]=new Guitar();
	                    break;
	        }
	        ar[i].play();
	        System.out.print("Index "+i+" : ");
	        if(ar[i] instanceof Piano)
	        System.out.println("Piano");
	        else if(ar[i] instanceof Flute)
	        System.out.println("Flute");
	        else if(ar[i] instanceof Guitar)
	        System.out.println("Guitar");
	    }
	}
}