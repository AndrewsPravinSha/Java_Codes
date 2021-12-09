package org.learning.code;

public class Tester {

	public static void main(String[] args) {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < 100; i++) {
			if (i%3==0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}
