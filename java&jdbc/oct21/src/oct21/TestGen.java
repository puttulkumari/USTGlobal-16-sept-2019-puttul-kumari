package oct21;

public class TestGen 
{

	public static void main(String[] args) 
	{
		FirstGen g1=new FirstGen();
		g1.call();
		g1.msg();
		System.out.println("****************");


		SecGen g2= new SecGen();
		g2.call();
		g2.msg();
		g2.game();
		System.out.println("****************");

		ThirdGen g3= new ThirdGen();
		g3.call();
		g3.msg();
		g3.game();
		g3.camera();
	}

}
