package oct22;

public class TestG 
{

	
		final void add() {
			System.out.println("add");
		}
		final void add(int a) {
			System.out.println("add(int a)");
		}
		
		
		
		public static void main(String[] args) 
		{
			
		SuperClass sup=new SuperClass();
		System.out.println("*********************");
		
		SubClass sub=new SubClass();
		sub.getSData();
		
		TestG g=new TestG();
		g.add();
		g.add(10);
		}

	}
