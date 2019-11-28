package oct22;

public class SubClass extends SuperClass 
{

	String s="Subclass variable";

	SubClass()
	{
		super();
		System.out.println("sub class construtor");	
	}

	void getSData() 
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("***************************");
		super.superClassMethod();
		superClassMethod();
	}


}
