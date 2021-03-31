package com.java.programs;

import java.util.Scanner;

public class PallindomeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		palindomenum(num);
	}

	static void palindomenum(int n) {
		
		int temp = n, rev=0, rem;
		while(temp!=0) {
			
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		
		if(n==rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Numer is not palindrome");
	}
}
