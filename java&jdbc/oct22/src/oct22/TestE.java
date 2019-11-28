package oct22;

public class TestE {

	public static void main(String[] args) {
		
		Bus b1=new Bus();
		b1.getdetails();
		
		
		Bus b2=new Bus(50);
		b2.getdetails();
		
		Bus b3=new Bus(60,"blue");
		b3.getdetails();
	}

}
