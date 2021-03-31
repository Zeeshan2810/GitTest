package com.java.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		primeNumber(num);
	}
	
	static void primeNumber(int n) {
		int temp = n;
		boolean flag = true;
		for(int i = 2; i<=temp/2; i++) {
			
			if(temp%i==0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
			
		
	}

}
