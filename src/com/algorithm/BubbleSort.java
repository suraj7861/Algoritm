package com.algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		//Array declaration and assign
		int[] arr = {49, 21, 34, 11, 7};
		System.out.println("Print element before sorting: ");
		//print before sorting
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//after bubble sorting
		int[] arr1 = bubbleSort(arr);
		System.out.println("Print element after sorting:");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	//bubble sorting
	private static int[] bubbleSort(int[] arr) {
		//temp variable declare
		int temp;
		//this for loop iterate whole element in array
		for(int i = 0; i < arr.length; i++ ) {
			
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					//swapping element
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
