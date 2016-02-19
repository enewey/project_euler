package euler10;

import java.util.ArrayList;

public class Euler10 {
	
	/**
	 * Code repurposed from Euler7 to find consecutive prime numbers
	 */
	public ArrayList<Integer> getPrimesBelow(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2); //add some primes initially
		primes.add(3);
		primes.add(5);
		primes.add(7); 
		primes.add(11);
		for (int i=13; i<n; i+=2) {
			boolean p = true;
			for (int j : primes) {
				if (i % j == 0) {
					p = false;
					break;
				}
			}
			if (p)
				primes.add(i);
		}
		return primes;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = (new Euler10()).getPrimesBelow(2000000);
		long sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		System.out.println(sum);
	}

}
