package wipro;

public class acceptgender {

		public static void main(String[] args) {
			if(args[0].compareTo("Male")==0||args[0].compareTo("male")==0)
			    {
			        if(Integer.parseInt(args[1])>=1 && Integer.parseInt(args[1])<=60)
			            System.out.print("Interest == 9.2%"+"\nGender ==> Male"+"\nAge ==>1-60");
			          else
			            System.out.print("Interest == 8.3%"+"\nGender ==> Male"+"\nAge ==>61-120");
			        }
			else{
			     if(Integer.parseInt(args[1])>=1 && Integer.parseInt(args[1])<=58)
			            System.out.print("Interest == 8.2%"+"\nGender ==> Female"+"\nAge ==>1-58");
			          else
			            System.out.print("Interest == 7.6%"+"\nGender ==> Female"+"\nAge ==>59-120");
			        }
				}
	}


