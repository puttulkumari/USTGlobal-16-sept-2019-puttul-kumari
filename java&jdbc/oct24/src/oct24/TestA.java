package oct24;

public class TestA 
{
	static int a;
	int b;

	static
	{
		a=10;
		System.out.println("static block1 is executed");
	}
	TestA()
	{
		System.out.println("constructor is executed");
	}
	public static void main(String[] args) 
	{

		TestA t=new TestA();
		TestA t1=new TestA();
		System.out.println("a value is"+a);
	}
    static 
    {
		a=20;
		System.out.println("static block 2");
	}
	static 
	{
		a=30;
		System.out.println("static block 3");
	}

}
