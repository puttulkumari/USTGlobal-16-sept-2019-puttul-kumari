package com.ustglobal.singleton;

public class Singlton 
{
	private static  Singlton instance = null;
     String s;
	
	private Singlton() {

	}

	public static Singlton getDBConnection() {
		if(instance == null)
		{
			instance = new Singlton();
			return instance;
		}
		else
		{
			return instance;
		}
	}

}
