import java.util.Scanner;
public class length_length 
{
	public static void main(String[] args) {
	    String str1,str2,res="";
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter first String\n");
		str1=s.nextLine();
		System.out.println("Enter Second String\n");
		str2=s.nextLine();
		int l1,l2;
		l1=str1.length();
		l2=str2.length();
		for(int i=0;i<l1 || i<l2; i++)
		{
		    if(i<l1)
		    res=res+str1.charAt(i);
		    if(i<l2)
		    res=res+str2.charAt(i);
		}
		System.out.println(res);
	}
}
