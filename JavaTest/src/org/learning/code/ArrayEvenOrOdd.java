package org.learning.code;

import java.util.Iterator;

public class ArrayEvenOrOdd {
	public static void main(String[] args) {
		int[] ar = new int[] {12,32,11,89,97,53,21,26,68};
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2==0) {
				System.out.println("Even numbers: "+ar[i]);
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2!=0) {
				System.out.println("Odd numbers: "+ar[i]);
			}
		}
	}

}
