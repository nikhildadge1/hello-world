
public class polymorphOverride2 extends PolymorphOverride
{
	public void Minus()
	{
		System.out.println("2nd minus system");
	}
	
	public static void main(String[] args)
	{
		PolymorphOverride o=new PolymorphOverride();
		PolymorphOverride o1 =new polymorphOverride2();
		o.Minus();
		o1.Minus();
		
	}
}
