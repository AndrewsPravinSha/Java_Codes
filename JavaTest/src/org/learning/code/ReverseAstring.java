package org.learning.code;

import java.util.Scanner;

public class ReverseAstring {
	
	public static void main(String[] args) {
		String str ="andrews",rev ="";
		for (int i = (str.length()-1); i >= 0; --i) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
