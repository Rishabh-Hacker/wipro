// need to modify it is not going for infinte times
package wipro;
import java.util.*;
public class menudriven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("****Menu*****");
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:int n1=sc.nextInt();
					int n2=sc.nextInt();
			System.out.println(n1+n2);
			System.out.println("Do you want to continue if yes enter y");
			String t=sc.nextLine();
			if(t.compareTo("y")==0||t.compareTo("Y")==0)
				continue;
			else
				System.exit(0);
			break;
			case 2:int n3=sc.nextInt();
			int n4=sc.nextInt();
			if(n3>n4)
	System.out.println(n3-n4);
			else
				System.out.println(n4-n3);
						
	System.out.println("Do you want to continue");
	String L=sc.nextLine();
	if(L.compareTo("y")==0||L.compareTo("Y")==0)
		continue;
	else
		System.exit(0);
				break;
			default:System.out.println("Wrong choice");
				
			}
				
		}
	
	}

}
