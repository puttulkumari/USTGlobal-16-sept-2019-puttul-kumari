package oct23;

public class Student 
{
	String name;
	int rollno;
	final String cname = "QSpiders";
	final int cid ;
	
	Student(String name,int rollno,final int cid )
	{
		this.name=name;
		this.rollno=rollno;
		this.cid=cid;
		
	}
	
	Student()
	{
		this.cid=22;
	}
	
	final void printDetails() 
	{
		System.out.println("hi "+name+" welcome in "+cname);
		
	}
	
	final void printDetails(String name) 
	{
		System.out.println("hi "+name+" welcome to "+cname);
		
	}
	
	

}
