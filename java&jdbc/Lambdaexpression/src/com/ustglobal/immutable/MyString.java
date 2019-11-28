package com.ustglobal.immutable;

public final class MyString {
	
	private final int id;
	private final String name;
	

	public MyString(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public MyString changeContent(int id, String name)
	{
		MyString m = new MyString(id,name);
		return m;
		
	}
	
	
}
