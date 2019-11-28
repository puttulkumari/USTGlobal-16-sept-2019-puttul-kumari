package oct21;

public class TestC 
{
	public static void main(String[] args) 
	{

		Person.color="white";
		System.out.println("color is "+Person.color);
		Person.sleep();
		System.out.println("******************************************");

		Person p=new Person();

		p.name="ram";
		p.age=22;
		// p.color="brown";
		System.out.println("name is "+p.name);
		System.out.println("age is "+p.age);
		//System.out.println("color is"+p.color);--------we can access but it is not recommended
		//p.sleep();
		p.eat();
		p.walk();

		System.out.println("******************************************");


		Person p1=new Person();

		p1.name="sita";
		p1.age=21;

		System.out.println("name is "+p1.name);
		System.out.println("age is "+p1.age);

		p1.eat();
		p1.walk();


	}

}
