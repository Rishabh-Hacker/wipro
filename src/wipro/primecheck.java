package wipro;

import java.util.Scanner;

public class primecheck {
public static void main(String args[]) {
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	int num=scan.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println("Prime Number");
	else
	   System.out.println("Not a Prime Number");
   
}
}
