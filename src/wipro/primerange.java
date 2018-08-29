package wipro;

public class primerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=10;i<=99;i++)
	if(isPrime(i)==true)
		System.out.println(i);
	}

public static boolean isPrime(int num) {
	int temp;
	boolean ischeck=true;
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
		   ischeck=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(ischeck)
	   return true;
	else
	   return false;
   

}
}
