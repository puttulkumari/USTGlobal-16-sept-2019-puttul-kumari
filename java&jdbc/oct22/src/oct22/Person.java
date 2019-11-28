package oct22;

public class Person {
	String name;
	int age;
	
	Person(String pname,int page){
		name=pname;
		age=page;
	}
	
	
	
	public static void main(String[] args) {
		
		Person p1=new Person("divya",20);
		
		Person p2=new Person("sita",23);
		
		Person p3=new Person("ranjana",23);
		//Person p=new Person();-------------->it will not work because we already define parameterized constructor.
		
	}
		
}

