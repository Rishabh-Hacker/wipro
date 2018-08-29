
abstract class GeneraBank
{
    double sIr,fIr;
    abstract double getSavingInterestRate();
    abstract double getFixedInterestRate();
}
class ICICIBank extends GeneraBank
{
    ICICIBank()
    {
        sIr=4;
        fIr=8.5;
    }
    double getSavingInterestRate()
    {
        return sIr;
    }
    double getFixedInterestRate()
    {
        return fIr;
    }
    
}
class KotakMBank extends GeneraBank
{
    KotakMBank()
    {
        sIr=6;
        fIr=9;
    }
    double getSavingInterestRate()
    {
        return sIr;
    }
    double getFixedInterestRate()
    {
        return fIr;
    } 
}
public class Main
{
	public static void main(String[] args) {
		ICICIBank obj1=new ICICIBank();
		KotakMBank obj2=new KotakMBank();
		GeneraBank obj3=new KotakMBank();
		GeneraBank obj4=new ICICIBank();
		System.out.println("sIr of ICICIBank is "+obj1.getSavingInterestRate());
		System.out.println("fIr of ICICIBank is "+obj4.getFixedInterestRate());
		System.out.println("sIr of KotakMBank is "+obj2.getSavingInterestRate());
		System.out.println("fIr of KotakMBank is "+obj3.getFixedInterestRate());
	}
}
