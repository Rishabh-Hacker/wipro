package wipro;
public class aplha_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=65,i;
		int a[]=new int[26];
		for(i=0;i<26;i++) {
			a[i]=n;
			n++;
		}
		for(i=0;i<26;i++) {
		System.out.print((char)a[i]+" ");
		}
	}

}
