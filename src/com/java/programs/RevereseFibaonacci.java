package com.java.programs;

public class RevereseFibaonacci {

	public static void main(String[] args) {
		
		int count = 4;
		revFib(count);
		
	}

//1. Using for loop and arrays	
//	static void revFib(int n) {
//		
//		int fib[] = new int[n+2];
//		fib[0]=0;
//		fib[1]=1;
//		
//		for(int i = 2; i<=n;i++) {
//			
//			fib[i]= fib[i-1]+fib[i-2];
//		}
//		
//		for (int i = n; i>=0;i--) {
//			System.out.print(fib[i]+" ");
//		}
//		
//	}

//2. Using recursion
	
	public static int f(int n){
	    if (n <= 1) 	    	
	        return n;
	    
	    else	    
	    	return f(n-1) + f(n-2);
	   	}

	static void revFib(int x){
	    if(x <= 0)
	        System.out.print(f(x));
	    else{
	        System.out.print(f(x)+" ");
	        revFib(x-1);
	    }
	}
}
