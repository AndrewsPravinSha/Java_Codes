package org.learning.code;


public class NumSwap {

	public static void main(String[] args) {
		 int x = 23;
		 int y = 56;
		 System.out.println("orginal numbers x :" +x+ "\n y:" +y);
		 x = x+y;
		 y = x-y;
		 x = x-y;
		 System.out.println("x :" +x+ "\n y:"+y );

	}

}
