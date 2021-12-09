package org.learning.code;

public class StringReverse2 {

	public static void main(String[] args) {
		String txt = "QWERTY";
		String rev = "";
		for (int i = txt.length(); i > 0; i--) {
			rev = rev + txt.charAt(i-1);
		}
		System.out.println(rev);
	}
}
