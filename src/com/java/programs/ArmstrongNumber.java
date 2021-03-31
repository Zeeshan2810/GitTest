package com.java.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

// Below commented code is to get the number of digits in a number
		int count = 0;
		int n=num;


		while(n!=0) {
			
			n=n/10;
			++count;
		}
	
		//System.out.println(count);
		
		int sum = 0, arm = num, digit;
		
		while(arm!=0) {
			int mul = 1;
			digit = arm%10;
			
			for(int i=1 ; i <=count;i++) {
				
				mul = mul*digit;
				
			}
			
			sum = sum + mul;
			arm = arm/10;
			
					
		}

//2. Code to check armstrong number with constant digits
/*
  int temp = num,digit,sum=0; while(temp!=0) {
 
  digit = temp%10;
  
  sum = sum + digit*digit*digit; temp = temp/10; }
 */

if(sum == num)
	System.out.println("Number "+sum+ " is armstrong");
else
	System.out.println("Number "+sum+ "  is not armstrong");




	}
	
	

}
