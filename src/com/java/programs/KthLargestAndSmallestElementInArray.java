package com.java.programs;

import java.util.Arrays;

public class KthLargestAndSmallestElementInArray {

	public static void main(String[] args) {
		
		int[] num = {12,4,2,8,9,11,3,1};
		int KthLargestElement = findKthElement(num, 3);
		System.out.println(KthLargestElement);
		

	}
	
	public static int findKthElement(int[] arr, int k) {
		
		Arrays.sort(arr);
		int targetIndex = arr.length - k;	
		return arr[targetIndex];
				
	}

}
