
public class Polymorphismm 
{
	public void Add(Object a)
	{
		System.out.println("1st add method");
	}
	
	public void Add(String b)
	{
		System.out.println("2nd add method");
	}
	
	public void add()
	{
		System.out.println("Hi Namskar");
	}
	
	public static void main(String[] args)
	{
		Polymorphismm p =new Polymorphismm();
		p.Add(null);
		p.add();
	}	
}
