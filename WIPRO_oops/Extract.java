import java.util.Scanner;
public class Extract
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter First String");
	    String str=s.nextLine();
		System.out.println("Enter Seperator");
		String str1=s.nextLine();
		String[] a=str.split(str1);
		String res="";
		res=res+a[0].charAt(a[0].length()-1);
		int l=a.length;
		for(int i=1;i<l-1;i++)
		{
		    res=res+a[i].charAt(0);
		    res=res+a[i].charAt(a[i].length()-1);
		}
		res=res+a[l-1].charAt(0);
		System.out.println("Result is\n"+res);
	}
}
