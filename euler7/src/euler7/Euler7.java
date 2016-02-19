package euler7;

import java.util.ArrayList;

public class Euler7 {
	
	public long findNthPrime(int n) {
		ArrayList<Long> primes = new ArrayList<Long>();
		primes.add((long) 2); //add some primes initially
		primes.add((long) 3);
		primes.add((long) 7); 
		primes.add((long) 11);
		int nth = 4; //4 primes found so far
		int i = 13; //starting test value
		while (true) {
			boolean p = true;
			for (long j : primes) {
				if (i % j == 0) {
					p = false;
					break;
				}
			}
			if (p) {
				primes.add((long)i);
				nth++;
				if (nth == n) return (long)i;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Euler7 e = new Euler7();
		System.out.println(e.findNthPrime(10001));
	}

}
