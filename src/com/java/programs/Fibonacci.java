package com.java.programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number of series: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		//fib(num);
		System.out.println("Fibonacci Series is: ");
		for(int i =0; i<num;i++) {
			
		System.out.print(fib(i)+" ");
		
		}
		System.out.println("\nNth Fibonacci Number is : "+fib(num));
	}
//1. Using recursion	
	
	  static int fib(int n) {
	  
	  if (n<=1)
		  return n;
	  
	  return fib(n-1)+fib(n-2); 
		
	  	  
	  }
	 
//	Using For loop

		/*
		 * public static void fib(int count) {
		 * 
		 * int n1=0,n2=1,n3; 
		 * System.out.print(n1+" "+n2); 
		 * for(int i=2;i<count;i++) {
		 * n3=n1+n2;
		 * System.out.print(" "+n3);
		 *  n1=n2;
		 *  n2=n3; }
		 * 
		 * }
		 */
}
