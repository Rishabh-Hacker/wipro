package wipro;
import java.util.*;
public class sum_avgarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0,i;
		double avg=0.0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			s+=a[i];
		}
		avg=s/n;
System.out.println("Sum is "+s);
System.out.println("Average is "+avg);

	}

}
