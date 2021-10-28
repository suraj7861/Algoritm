package com.algorithm;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// array declaration and assign
		String[] str = { "Harrier", "Hector", "Creta", "Brezza", "Nexon" };

		System.out.println("printing Array before sorted: ");
		// sort array using
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "   ");
		}
		System.out.println();

		System.out.println("Printing Array after sorted: ");

		// sort array using insertion sort
		String[] strSorted = insertionSort(str);
		for (int i = 0; i < strSorted.length; i++) {
			System.out.print(strSorted[i] + "   ");
		}
	}

	// method: Sorting Array using Insertion Sort
	public static String[] insertionSort(String[] str) {
		//declare and assign 
		int size = str.length;

		for (int i = 1; i < size; i++) {
			String temp = str[i];
			int j = i;
			// compare previous element to to next
			while (j > 0 && str[j - 1].compareTo(temp) > 0) {
				str[j] = str[j - 1];
				j = j - 1;
				str[j] = temp;
			}
		}
		return str;
	}
}