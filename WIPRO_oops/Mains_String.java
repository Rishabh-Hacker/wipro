import java.util.Scanner;
class Mains_String
{
    static String fHalf(String s,int l)
    {
        if(l%2!=0)
        return null;
        else
        {
            String temp="";
            for(int i=0;i<(l/2);i++)
            temp=temp+s.charAt(i);
            return temp;
        }
    }
   public static void main(String args[])
   {
      String str1, res = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str1 = sc.nextLine();
      int length1 = str1.length();
      res=fHalf(str1,length1);
      System.out.println(res);
   }
}