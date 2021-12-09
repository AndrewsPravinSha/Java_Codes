package org.learning.code;

public class RegexSample {

	public static void main(String[] args) {
		String regex = "^G...n$";
	    System.out.println("Green".matches(regex));
	    String regex1 = "^[0-9]+$";
	    System.out.println("34455".matches(regex1));
	    String emailRegex = "^(.+)@(.+)$";
	    System.out.println("aps.com".matches(emailRegex));
	}

}
