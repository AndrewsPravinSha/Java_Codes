package org.learning.code;

import java.util.Scanner;

public class PositiveInteger {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; ++i) {
			if (num%i==0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
