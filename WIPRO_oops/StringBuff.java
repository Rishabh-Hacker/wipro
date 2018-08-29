import java.util.Scanner;
 
class StringBuff
{
   public static void main(String args[])
   {
      String str1, res = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str1 = sc.nextLine();
      int length1 = str1.length();
      res=res+str1.charAt(0)+str1.charAt(1);
      String temp=""+res;
      for ( int i = 1; i <length1; i++ )
	  {
			res = res + temp;
	  }
         System.out.println(res);
   }
}