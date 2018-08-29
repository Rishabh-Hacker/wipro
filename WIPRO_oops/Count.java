import java.util.Scanner;
class Count
{
   public static void main(String args[])
   {
      String str1,str2, res = "";
      Scanner sc = new Scanner(System.in);
 
      
      System.out.println("Enter a word");
      str1 = sc.nextLine();
      System.out.println("Enter a seperator");
      str2 = sc.nextLine();
      System.out.println("Enter count");
      int i=sc.nextInt();
      res=res+str1;
      for(int j=1;j<i;j++)
    {
        res=res+str2;
        res=res+str1;
    }
      System.out.println(res);
   }
}