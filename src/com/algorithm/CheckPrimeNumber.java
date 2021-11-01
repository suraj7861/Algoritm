package com.algorithm;

public class CheckPrimeNumber {

	//check number is prime or not 
	public static boolean checkPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Check whether the number is prime or not:");

		System.out.print("Prime Number between 0-1000 are : ");
		for (int num = 0; num <= 1000; num++) {
			if (checkPrime(num)) {
				System.out.println(num + " ");
			}
			System.out.print("");			
		}
	}

}
