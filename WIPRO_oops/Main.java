void eat()
    {
        System.out.println("Animal Eat class");
    }
    void sleep()
    {
        System.out.println("Animal Sleep class");
    }class Animal
{
    void eat()
    {
        System.out.println("Animal Eat class");
    }
    void sleep()
    {
        System.out.println("Animal Sleep class");
    }
}
class Bird extends Animal
{
    void eat()
    {
        System.out.println("Bird Eat class");
    }
    void sleep()
    {
        System.out.println("Bird Sleep class");
    }
    void fly()
    {
        System.out.println("Bird Fly class");
    }
}
public class Main
{
	public static void main(String[] args) {
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}
