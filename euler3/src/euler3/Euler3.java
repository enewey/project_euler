package euler3;

import java.util.ArrayList;
import java.util.Collections;

public class Euler3 {
	
	public ArrayList<Long> primeFactors(long num) {
		ArrayList<Long> res = new ArrayList<Long>();
		long d = 2;
		while (num > 1) {
			while (num%d == 0){
				res.add(d);
				num /= d;
			}
			d += 1;
		}
		
		return res;
	}

	public static void main(String[] args) {
		Euler3 e = new Euler3();
		ArrayList<Long> list = e.primeFactors(Long.parseLong(args[0]));
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}

}
