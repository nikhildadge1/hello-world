
 public abstract class Abstract1       // In Abstract, both methods Implemented 
 										//And Non implemented  are present
{
	 static
	 {
		System.out.println("Hello :-)"); 
	 }
	 
	 {
		 System.out.println("Good morning");  // instance block
	 }
	 
	 Abstract1()
		{
			System.out.println("its a constructor");
		}
	public abstract void add();     // Abstract keyword is must
	
	
	public void minus()
	{
		System.out.println("Abstract class");
	}
	

}
