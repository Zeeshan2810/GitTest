package com.java.programs;

public class Print1To100WithoutUsingLoop {

	public static void main(String[] args) {
		
		printNos(100);

	}
	
	public static void printNos(int n) {
		
		if(n > 0) {
			printNos(n-1);
			System.out.println(n + " ");
				
		}
		return;
		
		
	}

}
