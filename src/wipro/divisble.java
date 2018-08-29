package wipro;

public class divisble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,p=5;
		while(p!=0) {
			if((i%2==0 && i%3==0) && i%5==0) {
				System.out.println(i);p--;
			}
			i++;
			}
	}

}
