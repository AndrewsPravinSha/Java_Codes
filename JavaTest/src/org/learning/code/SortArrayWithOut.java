package org.learning.code;

import java.util.Iterator;

public class SortArrayWithOut {
	public static void main(String[] args) {
		int[] ar = new int[] {21,45,67,89,4,56,40,33};
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				int temp = 0;
				if (ar[i]>ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j]=temp;
				}
			}
		System.out.println(ar[i]);
		}
	}

}
