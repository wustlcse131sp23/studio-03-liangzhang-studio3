package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Find the prime numbers up to what number?");
		int n = in.nextInt();

		int[] number = new int[n];

		//		value is the array named "number"

		//		
		for (int i = 0; i<n; i++) {
			number[i]= i; 
		}
		
		for (int i = 2; i<=sqrt(n); i++) {
			for (int j = i; j<=n/2; j++) {
				if (i*j < n) {
					number[i]=0;
				}
				
				
			}

		}

	}

	private static int sqrt(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
