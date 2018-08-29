package wipro;
import java.util.*;

public class max_min {

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
		System.out.println("Maximum "+a[n-1]);
		System.out.println("Minimum "+a[0]);
		
	}
	
}
