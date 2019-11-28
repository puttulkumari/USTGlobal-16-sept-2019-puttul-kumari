package oct23;

public class BMW implements AutoMobile,AutoMobilewithAbs 
{
	 public int gear()
	{
		System.out.println("gear() method");
		return 10;
	}
	
	public void gps() 
	{
		System.out.println("welcome in bmw");
	}
	public void abs() 
	{
		System.out.println("bmw new interface");
	}

}
