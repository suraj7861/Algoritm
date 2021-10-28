package com.algorithm;

public class MergeSort {

	static int[] tempArray;
	public static void main(String[] args) {
		//array declare and assign
		int [] arr = {42,32,12,52,18,82,22};
		tempArray = arr;
		System.out.println("print element before sorting");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("print element after sorting");
		int[] arr1 = mergeSort(arr);
	}

	private static int[] mergeSort(int[] arr) {
		divideArray(0, arr.length - 1);
		return arr;
	}

	private static void divideArray(int lowerIndex, int higherIndex) {
		
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex +(higherIndex -lowerIndex)/2;
			//it will sort left side of an array
			divideArray(lowerIndex, middle);
			
			//it will sort right side of an array
			divideArray(middle + 1, higherIndex);
			
			mergeArray(lowerIndex, middle, higherIndex);
		}
	}
	
	public static void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for(int i = lowerIndex; i <= higherIndex; i++ ) {
			 
		}
	}

}
