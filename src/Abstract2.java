
public class Abstract2 extends Abstract1
{
	@Override
	public void add() 
	{
		System.out.println("Add method implemented");
	}
	
	public void display()
	{
		System.out.println("Hi...");
	}
	
	public static void main(String[] args)
	{
		Abstract2 a=new Abstract2();
		a.add();
		a.display();
		a.minus();
	}
	
}
