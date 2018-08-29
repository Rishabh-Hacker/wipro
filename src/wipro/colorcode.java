package wipro;

public class colorcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch=args[0].charAt(0);
if(ch>=65&&ch<=90)
ch=ch;
else
ch=(char) (ch-32);
switch(ch) {
case 'R':System.out.println("Red");
	break;
case 'B':System.out.println("Blue");
	break;
case 'G':System.out.println("Green");
	break;
case 'O':System.out.println("Orange");
	break;
case 'Y':System.out.println("Yellow");
	break;
case 'W':System.out.println("White");
	break;
default:	System.out.println("No color code matched");
}
	}

}
