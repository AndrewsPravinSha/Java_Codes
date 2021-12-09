package org.learning.code;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSimple {
 public static void main(String[] args) {
	 int firstNum = 0 ,secondNum =1;
	 System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(firstNum +" ");
			
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
}
}
