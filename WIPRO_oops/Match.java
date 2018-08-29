import java.util.Scanner;
class Match
{
    static String f(String s,int l)
    {
            if(s.charAt(0)=='x' && s.charAt(l-1)=='x')
            {
            String temp="";
            for(int i=1;i<l-1;i++)
            temp=temp+s.charAt(i);
            return temp;
            }
            else
            return s;
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