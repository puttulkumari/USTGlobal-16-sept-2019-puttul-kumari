package oct22;

public class Emp1 
{

	String name;
	int eid;
	public Emp1(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}

	void printDetails() {
		System.out.println("employee name is "+name);
		System.out.println("employee id  is "+eid);
		this.sayHello();
	}

	void sayHello() {
		System.out.println("hello "+name+" welcome user");
	}
	public static void main(String[] args) 
	{

		Emp1 e1=new Emp1("raj",139);
		e1.printDetails();


		Emp1 e2=new Emp1("sona",230);
		e2.printDetails();

		Emp1 e3=new Emp1("mona",400);
		e3.printDetails();   
	}
}
