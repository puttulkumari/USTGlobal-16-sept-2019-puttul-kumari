package com.ustglobal.exception.customizeuncheckedexception;

public class InvalidAgeException  extends RuntimeException {


	String message="invalid age below 18 yrs not allowed";

	public InvalidAgeException() {

	}

	public InvalidAgeException(String message) {
		this.message = message;

	}

	//@Override
	//public String getMessage() {
	//	return message;
	//}

	//@Override
	//public String toString() {
	//	return  message ;
	//}

}
