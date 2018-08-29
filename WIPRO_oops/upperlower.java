import java.util.Scanner;
 
class UpperLower
{
   public static void main(String args[])
   {
      String str1,str2, res = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a first string:");
      str1 = sc.nextLine();
	  System.out.println("Enter a Second string:");
      str2 = sc.nextLine();
 
      int length1 = str1.length();
	  int length2= str2.length();
 
		char c;
      for ( int i = 0; i <length1; i++ )
	  {
			c = str1.charAt(i);
			if (Character.isUpperCase(c)) 
			res = res + Character.toLowerCase(c);
			else
			res = res + str1.charAt(i);
	  }
	  c=str2.charAt(0);
	  if (Character.isUpperCase(c)) 
			c = Character.toLowerCase(c);
	  if(res.charAt(length1-1)!=c)
	        res=res+c;
	  for ( int i = 1; i <length2; i++ )
	  {
			c= str2.charAt(i);
			if (Character.isUpperCase(c)) 
			res = res + Character.toLowerCase(c);
			else
			res = res + str2.charAt(i);
	  }
         System.out.println(res);
   }
}