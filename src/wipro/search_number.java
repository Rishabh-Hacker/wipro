package wipro;
import java.util.*;

public class search_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,n2;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=-1;
		System.out.println("Enter the number to search");
		n2=sc.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==n2) {
				temp=i;
			}
		}
		if(temp==-1)
			System.out.println(-1);
		else
			System.out.println(temp+1);
			
		
	}

}
