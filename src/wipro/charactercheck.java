package wipro;
import java.util.*;

public class charactercheck {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			String j=sc.nextLine();
			char i=j.charAt(0);
			if(i>=97 && i<=122 || i>=65 && i<=90)
			    System.out.println("Alphabet");
			else if(i>=48 && i<=57)
			    System.out.println("Digits");
			else
			    System.out.println("Special Charcter");
		}
	}


