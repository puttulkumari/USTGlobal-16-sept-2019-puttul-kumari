package com.ustglobal.collectionframework.list;

public class Student {
	
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

}
