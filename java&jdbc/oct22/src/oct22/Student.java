package oct22;

public class Student {
	
	int rollNo;
	String name;
	String cname;
	int marks;
	String fname;
	
	
	public Student(int rollNo,String name,String cname,int marks,String fname)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.cname=cname;
		this.marks=marks;
		this.fname=fname;
	}

	void printDetails() {
		System.out.println("Student roll no is "+rollNo);
		System.out.println("Student name is "+name);
		System.out.println("Student college name is "+cname);
		System.out.println("Student marks is "+marks);
		System.out.println("Student father's name is "+fname);
	}

	public static void main(String[] args) 
	{

		 Student s1=new Student(1,"ram kumar","kedriya school",55,"Sankar nath");  
		 s1.printDetails();
		 System.out.println("*****************");
		 Student s2=new Student(2,"ramesh singh","kedriya school",59,"prabat nath singh"); 
		 s2.printDetails();
		 System.out.println("*****************");
		 Student s3=new Student(3,"rajesh singh","kedriya school",70,"Shiv singh");  
		 s3.printDetails(); 
		 System.out.println("*****************");
		 Student s4=new Student(4,"raj verma","kedriya school",71,"deepu verma"); 
		 s4.printDetails();
		 System.out.println("*****************");
		 Student s5=new Student(5,"ramashrya pandey","kedriya school",48," Radhey pandey");  
		 s5.printDetails();
		 System.out.println("*****************");
		 Student s6=new Student(6,"ramanuj reddy","kedriya school",55,"rajanikant reddy"); 
		 s6.printDetails();
		 System.out.println("*****************");
		 Student s7=new Student(7,"ramaya","kedriya school",63,"Suraj");  
		 s7.printDetails();
		 System.out.println("*****************");
		 Student s8=new Student(8,"rita gond","kedriya school",80,"Suresh gond");  
		 s8.printDetails();
		 System.out.println("*****************");
		 Student s9=new Student(9,"rishi jaiswal","kedriya school",85,"Sanskar jaiswal"); 
		 s9.printDetails();
		 System.out.println("*****************");
		 Student s10=new Student(10,"rakesh srivastava","kedriya school",88,"Mohan srivastava");  
		 s10.printDetails();
		 
	}
}
	
