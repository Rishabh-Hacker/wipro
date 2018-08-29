package wipro;

public class upperlower {
		public static void main(String[] args) {
		char a=args[0].charAt(0);
		if(a>=65 && a<=90)
		    System.out.println(a+"->"+(char)(a+32));
		if(a>=97 && a<=122)
		    System.out.println(a+"->"+(char)(a-32));
		}
	}

