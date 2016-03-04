package euler14;

import java.util.ArrayList;

public class Euler14 {

	public ArrayList<Long> collatzSequence(long start) {
		ArrayList<Long> list = new ArrayList<Long>();
		while (start > 1) {
			list.add(start);
			if (start%2 == 0) start /= 2;
			else start = (start*3) + 1;
		}
		return list;
	}
	
	public static void main(String[] args) {
		Euler14 e = new Euler14();
		int max = -1;
		long best = -1;
		for (long i=999999; i > 1; i--) {
			ArrayList<Long> seq = e.collatzSequence(i);
			if (seq.size() > max) {
				max = seq.size();
				best = i;
			}
		}
		System.out.println(best);
	}

}
