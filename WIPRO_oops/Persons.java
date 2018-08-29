
import java.util.Scanner;
class Persons
{
    private String name;
    private int age;
    Person()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name");
        name=s.nextLine();
        System.out.println("Enter Age");
        age=s.nextInt();
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
}
class Student extends Persons
{
    private String contact;
    private Person p;
    Student()
    {
        p=new Person();
        System.out.println("Enter Contact Details");
        contact=s.nextLine();
    }
    String getContact()
    {
        return contact;
    }
}
class Teacher extends Persons
{
    private double salary;
    private String subject;
    Teacher()
    {
        System.out.println("Enter Salary");
        salary=s.nextDouble();
        System.out.println("Enter Subject");
        subject=s.nextLine();
    }
    double getSalary()
    {
        return salary;
    }
    String getSubject()
    {
        return subject;
    }
}
class CollegeStudent
{
    private int year;
    private String major;
    CollegeStudent()
    {
        System.out.println("Enter year");
        year=s.nextInt();
        s.nextLine();
        System.out.println("Enter major");
        major=s.nextLine();
    }
    int getYear()
    {
        return year;
    }
    String getMajor()
    {
        return major;
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	}
}
