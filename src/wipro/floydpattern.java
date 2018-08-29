package wipro;

public class floydpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args[0]==null) 
			System.out.println("Please enter an Integer number");
		else {
			int n=Integer.parseInt(args[0]);
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++)
					System.out.print("* ");
				System.out.println();
			}
			}
		}
	}


