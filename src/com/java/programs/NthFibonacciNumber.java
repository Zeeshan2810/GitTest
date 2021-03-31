package com.java.programs;

import java.util.Scanner;

public class NthFibonacciNumber {
	      
	    public static void main (String args[])
	    {
	    	System.out.println("Enter a Number of series: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.close();
	    
			System.out.println(fib(num));
	    }

	  static int fib(int n)
	    {
	    if (n <= 1)
	       return n;
	    return fib(n-1) + fib(n-2);
	    }
}
