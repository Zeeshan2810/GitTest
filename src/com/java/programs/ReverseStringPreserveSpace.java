package com.java.programs;

public class ReverseStringPreserveSpace {

	public static void main(String[] args) {
		
		reverses("internship at geeks for geeks");
		//reverses("Help Others");
		preserveSpace("internship at geeks for geeks");
	}
	
	static void reverses(String s) {
		
		char[] inputarray = s.toCharArray();
		char[] result = new char[inputarray.length];
		
		for(int i =0 ; i< inputarray.length; i++) {
			
			if(inputarray[i]== ' ') {
				
				result[i] = ' ';
			}
		}
		
		
		int j = inputarray.length -1;
		
		for(int i = 0 ; i < inputarray.length ; i++) {
			
			if(inputarray[i]!=' ') {
				
				if(result[j] == ' ') {
					j--;
					
				}
				
				result[j]=inputarray[i];
				j--;
			}
			
		}
		
	
		System.out.println(String.valueOf(result));
	}
	
	public static void preserveSpace(String s) {
		
		char[] str = s.toCharArray();
		
		int start = 0;
		int end = str.length -1;
		
		while(start < end) {
			
			if(str[start] == ' ') {
				start++;
				continue;
			}
				else if(str[end]== ' ') {
					
					end--;
					continue;
				}
					else
					{
						char temp = str[start];
						str[start] = str[end];
						str[end]= temp;
						start++;
						end--;
					}
				}
		System.out.println(String.valueOf(str));
				
			}
	

	}
	


