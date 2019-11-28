package com.ustglobal.lambdaexpressions;

public class TestSqure {
	public static void main(String[] args) {
		
		SquareInterface sq = x->x*x;
		int value = sq.square(4);
		System.out.println("square is "+value);
	}

}
