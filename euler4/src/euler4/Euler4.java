package euler4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Euler4 {

	public boolean isPalindromic(int num) {
		StringBuilder sb = new StringBuilder(Integer.toString(num));
		//Two cases: even length (exact mirror) or odd length (with pivot)
		if (sb.length()%2 == 0) {
			String fh = sb.substring(sb.length()/2);
			String bh = sb.reverse().substring(sb.length()/2);
			return fh.equals(bh);
		} else {
			String fh = sb.substring((sb.length()-1)/2);
			String bh = sb.reverse().substring((sb.length()-1)/2);
			return fh.equals(bh);
		}
	}
	
	public static void main(String[] args) {
		Euler4 e = new Euler4();
		HashSet<Long> set = new HashSet<Long>();
		int a = 999, b = 999;
		while (a > 100) {
			while (b > 100) {
				if (e.isPalindromic(a*b)) {
					set.add(Integer.toUnsignedLong(a*b));
				}
				b -= 1;
			}
			b=999;
			a-=1;
		}
		System.out.println(Collections.max(set));
	}

}
