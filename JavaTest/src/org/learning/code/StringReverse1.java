package org.learning.code;

public class StringReverse1 {
	public static void main(String[] args) {
		String text = "ANDREWS";
		StringBuffer buffer = new StringBuffer();
		buffer.append(text);
		System.out.println(buffer.reverse());
	}

}
