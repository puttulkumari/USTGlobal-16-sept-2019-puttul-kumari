package oct21;

public class TestB {
	public static void main(String[] args) 
	{

		

		Cow c=new Cow();
		c.name="heera";
		c.color="white";
		System.out.println("cow name is "+c.name);
		System.out.println("cow color is "+c.color);
		c.sleep();
		c.eat();
		
		System.out.println("=====================================");
		
		Cow c1=new Cow();
		c1.name="beta";
		c1.color="brown";
		System.out.println("cow name is "+c1.name);
		System.out.println("cow color is "+c1.color);
		c1.sleep();
		c1.eat();
	}

}
