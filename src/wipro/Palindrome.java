package wipro;

public class Palindrome {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
				int n=Integer.parseInt(args[0]);
				int h=n,s=0;
				while(n!=0) {
				s=(s*10)+n%10;
				n/=10;
			}
				if(h==s)
					System.out.println(h+" is a Palindrome Number");
				else
					System.out.println(h+" is not a Palindrome Number");
				
		}
			}
