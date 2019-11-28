package oct22;

public class TestA 
{
	public static int add(int a,int b) 
	{
		System.out.println("add(int a,int b)method");
		return a+b;
	}

	public static long add(long a,int b) 
	{
		System.out.println("add(int a,byte b)method");
		return a+b;
	}


	public static long add(int a,byte b) 
	{
		System.out.println("add(int a,byte b)method");
		return a+b;

	}




	public static void add(short a,byte b) 
	{
		System.out.println("add(int a,int b)method");

	}


	public int multiply(int a,int i) 
	{
		System.out.println("add(int a,int b)method");
		return a*i;

	}

	public int multiply(byte a,int b) 
	{
		System.out.println("add(int a,int b)method");
		return a+b;

	}
	public static void main(String[] args) {
		 System.out.println("main(int a) method");
		 main(10);
		 add(10, 20);
		 add(30, 40);
		 add(50, 60);
		 
		 TestA t=new TestA();
		 t.multiply(1, 4);
		 t.multiply(5, 4);

	}
	public static void main(int a) 
	{
      System.out.println("main(int a) method");
	}


}
