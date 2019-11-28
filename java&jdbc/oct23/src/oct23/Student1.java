package oct23;

public class Student1 extends Person {
	
	double marks;
	int rollno;
	
	Student1(double marks,int rollno,String name,int age){
		super (name,age);
		this.marks=marks;
		this.rollno=rollno;
	}
}
