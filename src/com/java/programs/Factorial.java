package com.java.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("Factorial of number is: "+fact(num));
		

	}
	
//1. Using recursion
	/*
	 * public static int fact(int n) {
	 * 
	 * if (n==0) return 1; else return n*fact(n-1); }
	 */

//2. Using For loop
	static int fact(int n) {	
	
	if(n == 0)
		return 1;
	else {
	int factNum = 1;
	for(int i = 1 ; i<=n ; i++) {
		
		 factNum = factNum*i;
				
	}
	
	return factNum;
}
	}	
}
