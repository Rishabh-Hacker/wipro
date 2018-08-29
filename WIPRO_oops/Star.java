import java.util.Scanner;
public class Star
{
	public static void main(String[] args) {
	    String str,res="";
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter String\n");
		str=s.nextLine();
		int f=0;
		int l=str.length();
		for(int i=0;i<l-1;i++)
		{
		    if(str.charAt(i+1)=='*')
		    {
		        f=1;
		        continue;
		    }
		    if(f==1)
		    {
		        i++;
		        f=0;
		        continue;
		    }
		    res=res+str.charAt(i);
		}
		if(str.charAt(l-1)!='*')
            res=res+str.charAt(l-1);
		System.out.println(res);
	}
}
