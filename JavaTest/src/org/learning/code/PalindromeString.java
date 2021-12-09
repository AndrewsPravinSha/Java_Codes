package org.learning.code;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "Malayalam",rev="";
		for (int i = (str.length()-1); i >=0 ; --i) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not palindrome");

		}
	}
	

}
