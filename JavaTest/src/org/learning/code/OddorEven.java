package org.learning.code;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		System.out.print("Enter a Number:");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		if(userInput%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}

}
