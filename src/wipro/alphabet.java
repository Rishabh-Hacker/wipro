package wipro;

public class alphabet
{
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
		    String temp=" ";
		    for(int j=1;j<args.length;j++){
		        if(args[j-1].compareTo((args[j]))>0)
		            {
		                temp=args[j-1];
                    args[j-1]=args[j];
                    args[j]=temp;
		            }
		    }
		}
		for(String i:args)
        {
            System.out.print(i+", ");
        }
	}
}
