package euler12;

import java.util.HashSet;

public class Euler12 {

	public HashSet<Long> findDivisors(long num) {
		HashSet<Long> set = new HashSet<Long>();
		set.add((long)1);
		set.add(num);
		long div = 2;
		for (long i=2; i<num/div; i++) {
			if (num%i == 0) {
				set.add(i);
				set.add(num/i);
				div = i;
			}
		}
		return set;
	}
	
	public static void main(String[] args) {
		Euler12 e = new Euler12();
		for (long i=1; true; i++) {
			long tri = 0;
			for (long j=i; j > 0; j--) tri+=j;
			HashSet<Long> set = e.findDivisors(tri);
			if (set.size() > 500) {
				System.out.println(tri);
				break;
			}
		}
	}
}
