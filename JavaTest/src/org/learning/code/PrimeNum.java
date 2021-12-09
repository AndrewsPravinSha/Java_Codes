package org.learning.code;

public class PrimeNum {
	public static void main(String[] args) {
		int n = 3;
		boolean prime = false;
		for (int i = 2; i <= n/2; i++) {
			while (n%i==0) {
				prime= true;
				break;
			}
		}
		if (!prime) {
			System.out.println(n+" is a prime num");
		} else {
			System.out.println(n+" is not a prime num");

		}
	}

}
/*int number = 28;
boolean prime = false;
for (int i = 2; i <= number / 2; ++i) {
  if (number % i == 0) {
    prime = true;
    break;
  }
}

if (!prime)
  System.out.println(number + " is a prime number.");
else
  System.out.println(number + " is not a prime number.");*/