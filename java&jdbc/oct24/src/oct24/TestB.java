package oct24;

public class TestB 
{
	static int a;
	int b;
	{
		a=10;
		b=20;
		System.out.println("non-static block1 is executed");
	}

	public static void main(String[] args) 
	{
		System.out.println("main started");
		TestB t=new TestB();
		TestB t1=new TestB();
		System.out.println("main ended");
	}

	{
		System.out.println("non-static block2 is executed");
	}
}