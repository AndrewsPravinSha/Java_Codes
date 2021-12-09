package org.learning.code;

import java.util.Arrays;

public class SortingOutArray {
	public static void main(String[] args) {
		int [] ar = new int[] {23,67,90,20,52,45,12,32};
		Arrays.sort(ar);
		System.out.println("--Sorted Array--");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

}
