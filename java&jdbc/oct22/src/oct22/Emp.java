package oct22;

public class Emp {
	
	String name;
	int eid;
	public Emp(String empname,int empid)
	{
		name=empname;
		eid=empid;
	}
	
	void printDetails() {
		System.out.println("employee name is "+name);
		System.out.println("employee id  is "+eid);
	}
	public static void main(String[] args) {
		
     Emp e1=new Emp("rashmika",139);
     e1.printDetails();
     
     Emp e2=new Emp("manasi",230);
     e2.printDetails();
     Emp e3=new Emp("srk",400);
     e3.printDetails();
     
     //---------------------------------with constructor
     
     
	}

}
