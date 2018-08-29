package wipro;
import java.util.*;
public class highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		int b=0,c=0,p=0;
		for(i=0;i<n-1;i++) {
			for(int j=1;j<n;j++) {
			if(a[i]==a[j])
				{c++;
				p=a[i];
			}}
			if(b>c) {
			b=c;
			p=a[i];
			}
		}

System.out.println("Highest frequency: "+c+"number is"+p);
		}
}
