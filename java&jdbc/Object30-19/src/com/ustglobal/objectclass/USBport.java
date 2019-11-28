package com.ustglobal.objectclass;

public class USBport {
	public static void  connect(Object obj)
	{
		
		if(obj instanceof Mouse )
		{
		Mouse m =(Mouse) obj;
		m.click();
		m.scroll();
		
		}
		
		else if(obj instanceof Pendrive )
		{
		Pendrive p=(Pendrive) obj;
		p.read();
		p.write();
		//System.out.println("connected");
	    }
		else
		{
			System.out.println("invalid object");
	
		}
	}

}
