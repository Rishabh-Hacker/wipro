package wipro;
import java.util.*;
public class sumofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=0;
	sc.close();
	while(n!=0)
	{
		s+=n%10;
		n/=10;
	}
	System.out.println(s);
	}

}
