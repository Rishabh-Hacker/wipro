package wipro;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int h=n,s=0;
		while(n!=0) {
		s=(s*10)+n%10;
		n/=10;
	}
System.out.println("I/P :"+h+"\nO/P :"+s);
}
	}
