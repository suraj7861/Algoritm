package com.algorithm;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "cdab";
		
		System.out.println("string 1 :"+ str1);
		System.out.println("string 2 :"+ str2);
		
		char[] x = str1.toCharArray(); 
		char[] y = str2.toCharArray();
		
		//Arrays.sort(x);
		//Arrays.sort(y);
		
		Boolean result = Arrays.equals(x, y);
		
		if(result == true) {
			System.out.println("Strings are Anagram");
		}
		else {
			System.out.println("Strings are not Anagram");
		}
	}

	//bubble sorting
	private static char[] sort(char[] x) {
		//temp variable declare
		char temp;
		//this for loop iterate whole element in array
		for(int i = 0; i < x.length; i++ ) {
			
			for(int j = 0; j < x.length-1-i; j++) {
				if(x[j].compareTo(x[j+1]) > 0 ) {
					//swapping element
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
		return x;
	}
}
