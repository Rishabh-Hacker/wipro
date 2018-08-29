import java.util.Scanner;
public class MyClass{
	public static void main(String[] args) {
	    String str1,res="";
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter first String\n");
		str1=s.nextLine();
		System.out.println("Enter Length\n");
		int l=s.nextInt();
		int l1;
		l1=str1.length();
		if(l1<l)
	    {
	        System.out.println("Length is large");
	        return;
	    }
	    String temp="";
	    for(int i=1;i<=l;i++)
	    temp=str1.charAt(l1-i)+temp;
		for(int i=0;i<l; i++)
		{
		    res=res+temp;
		}
		System.out.println(res);
	}
}