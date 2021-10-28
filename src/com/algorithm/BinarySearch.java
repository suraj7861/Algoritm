package com.algorithm;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// create string array and assign
		String[] str = { "Tata", "Ford", "Mahindra", "Suzuki", "Bajaj" };
		System.out.println("Before sorting:" + Arrays.toString(str));
		
		// sort string
		String[] str1 = sort(str);
		System.out.println("After sorting:" + Arrays.toString(str));

		// word to search in string
		String search = "Tata";
		int result = binarySearch(str1, search);

		if (result == -1)
			System.out.println(search + " = Word not present in String");
		else
			System.out.println(search + " = Word found in String at index: " + result);

	}
	
	//bubble sorting
	private static String[] sort(String[] str) {
		//temp variable declare
		String temp;
		//this for loop iterate whole element in array
		for(int i = 0; i < str.length; i++ ) {
			
			for(int j = 0; j < str.length-1-i; j++) {
				if(str[j].compareTo(str[j+1]) > 0 ) {
					//swapping element
					temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		return str;
	}
	
	//binary search method to search word
	private static int binarySearch(String[] str1, String search) {

		int start = 0, size = str1.length - 1;
		while (start <= size) {
			int mid = start + (size - start) / 2;
			int res = search.compareTo(str1[mid]);

			// Check if search word is present at mid
			if (res == 0)
				return mid;

			// If search word greater, ignore left half
			if (res > 0)
				start = mid + 1;

			// If search word is smaller, ignore right half
			else
				size = mid - 1;
		}
		return -1;
	}

}
