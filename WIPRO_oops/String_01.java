import java.util.Scanner;
class String_01
{
    static String f(String s,int l)
    {
            String temp="";
            for(int i=1;i<l-1;i++)
            temp=temp+s.charAt(i);
            return temp;
    }
   public static void main(String args[])
   {
      String str1, res = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str1 = sc.nextLine();
      int length1 = str1.length();
      res=f(str1,length1);
      System.out.println(res);
   }
}