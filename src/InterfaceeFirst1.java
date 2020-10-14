
public class InterfaceeFirst1 implements InterfaceFirst
{
	@Override
	 public void first()      // In interface use keyword as -- implements --
	{
		 System.out.println("First method");
		
	} 

	
	public void Second() {
		System.out.println("Second method");
		
	}

	@Override
	public void Third() {
		System.out.println("Third method");
		
	}

	 public static void main(String[] args)
	 {
		 InterfaceeFirst1 i = new InterfaceeFirst1();
		 i.first();
		 i.Second();
		 i.Third();
	 }
}
