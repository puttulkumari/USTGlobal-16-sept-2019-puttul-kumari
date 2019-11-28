package oct22;

public class Emp2 {


		String name;
		int eid;
		long aadharno;
		public Emp2(String name,int eid)
		{
			this.name=name;
			this.eid=eid;
		}
		
		public Emp2(int eid,String name)
		{
			this.name=name;
			this.eid=eid;
		}
		
		public Emp2(String name,int eid,long aadharno)
		{
			this.name=name;
			this.eid=eid;
			this.aadharno=aadharno;;
		}

		void printDetails() {
			System.out.println("hi " +name+ " welcome in ust");
			
		
		}

	}



