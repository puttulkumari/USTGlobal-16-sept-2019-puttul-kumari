package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.Angular;
//import com.ustglobal.studentapp.jspiders.React;
import com.ustglobal.studentapp.jspiders.*;

public class TestA {
	
	
	public static void main(String[] args) {
		
	
	
	QTP q=new QTP();
	q.teachQtp();
	
	
	Selenium se = new Selenium();
	se.teachSelenium();
	
	
	//com.ustglobal.studentapp.jspiders.Angular a=new com.ustglobal.studentapp.jspiders.Angular();
	//a.teachAngular();
	
	//com.ustglobal.studentapp.jspiders.React r=com.ustglobal.studentapp.jspiders.React();
	//r.taechReact();
	
	
	Angular a=new Angular();
	a.teachAngular();
	
	
	React r=new React();
	r.teachReact();
	}
}
