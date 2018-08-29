import java.util.Scanner;
class Employee extends Person
{
	double salary;
	int sYear;
	String NIN;
	Employee()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		name=s.nextLine();
		System.out.println("Enter Salary");
		salary=s.nextDouble();
		s.nextLine();
		System.out.println("start Year");
		sYear=s.nextInt();
		s.nextLine();
		System.out.println("Enter NIN");
		NIN=s.nextLine();
	}
	String getName()
	{
		return name;
	}
	String getNIN()
	{
		return NIN;
	}
	double getSalary()
	{
		return salary;
	}
	int getSYear()
	{
		return sYear;
	}
	
}