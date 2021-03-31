package com.java.programs;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
	//1. First way to reverse a string using for loop
		
	/*	int len = s.length();
		String rev = "";
		for(int i=len-1; i>=0;i--){
			
			rev = rev + s.charAt(i);
						
		}
		System.out.println("Reverse of given String is: "+rev);*/
		
	//2. Using reverse() method of StringBuffer class
		//StringBuffer sb = new StringBuffer(s);
		//System.out.println("Reverse of given String is: "+sb.reverse());
		

	//3. Reverse the string by word by word and not reversing original string
		//Ex: My name is Zeeshan
		//yM eman si nahseez

	/*
	 * String str = ""; 
	 * String[] words = s.split(" "); 
	 * for(int i = words.length-1 ; i >=0 ; i--){
	 * 
	 * str = str + words[i]+" ";
	 * 
	 * }
	 * 
	 * System.out.println(str);
	 * 
	 * String newrev = "";
	 * 
	 * for(int j = str.length()-1; j>=0;j--){
	 * 
	 * newrev = newrev + str.charAt(j); }
	 * 
	 * System.out.println(newrev);
	 */
		
		
//4. using for each loop
	/*
	 * String rev = ""; for(String word : s.split(" ")) {
	 * 
	 * for(int i = word.length()-1;i>=0;i--) {
	 * 
	 * rev = rev + word.charAt(i); }
	 * 
	 * rev = rev + " ";
	 * 
	 * } System.out.println(rev);
	 */
		
//5. Using Reverse a string word by word using recursion
		
		//System.out.println(s.substring(1)+s.charAt(0));
		String reversed = reverseString(s);  
		System.out.println("The reversed string is: " + reversed);  	
		
		
	}
	
	public static String reverseString(String s)  
	{  
	if (s.isEmpty())                            //checks the string if empty  
	return s;  
	return reverseString(s.substring(1)) + s.charAt(0);                     //recursively called function  
	}  

}
