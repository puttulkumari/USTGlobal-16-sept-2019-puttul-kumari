package oct23;

public class Teacher extends Person {
	
		String subject;
		int experience;
		
		Teacher(String subject,int experience,String name,int age){
			super (name,age);
			this.subject=subject;
			this.experience=experience;
		}
	}

