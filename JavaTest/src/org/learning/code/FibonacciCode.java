package org.learning.code;

import java.util.Scanner;

public class FibonacciCode {
	
	private static void fibonacciSeries(int N) {
		 int num1 = 0, num2 = 1;
		  
	        int counter = 0;
	        

	        while (counter < N) {

	            System.out.print(num1 + " ");
	  
	            // Swap
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	            counter = counter + 1 ;
	            }

	}

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		fibonacciSeries(N);
		

	}

}
