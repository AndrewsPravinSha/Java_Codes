package org.learning.code;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.print("Enter a word:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		char[] charArray = text.toCharArray();
		String reverse = "";
		for (int i = charArray.length-1 ; i >= 0; i--) {
			reverse = reverse + charArray[i];
		}
		System.out.println(reverse);

	}

}
