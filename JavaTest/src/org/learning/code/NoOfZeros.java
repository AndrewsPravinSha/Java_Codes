 package org.learning.code;

public class NoOfZeros {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 567; i++) {
			if (i%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
