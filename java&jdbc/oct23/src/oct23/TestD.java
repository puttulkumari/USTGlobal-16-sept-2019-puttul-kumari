package oct23;

public class TestD {
	public static void main(String[] args) 
	{
		Father f=new Father();
		f.marry();
	    System.out.println("************");
		f.property();
		System.out.println("----------------------------------");
		Son s=new Son();
		s.marry();
		System.out.println("************");
		s.property();
		
	}

}
