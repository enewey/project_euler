package euler21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Euler21 {

	public HashSet<Integer> getDivisors(int num) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		int ceil = num;
		for (int i=2; i<ceil; i++) {
			if (num%i == 0) {
				ceil = num/i;
				if (ceil != i)
					set.add(num/i);
				set.add(i);
			}
		}
		return set;
	}
	
	public int getSetTotal(Set<Integer> set) {
		int tot = 0;
		for (int x : set) {
			tot += x;
		}
		return tot;
	}
	
	public int sumOfAmicable(int range) {
		HashSet<Integer> amicableNumbers = new HashSet<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=2; i < range; i++) {
			if (map.containsKey(i)) continue;
			
			int total = getSetTotal(getDivisors(i));
			map.put(i, total);
			if (!map.containsKey(total)) {
				int t = getSetTotal(getDivisors(total));
				map.put(total, t);
			}
			//note: sum of divisors of 496 is equal to 496.. same with 8128.
			// solution: don't account for a number amicable with itself.
			if (map.get(total) == i && total == map.get(i) && i != total){
				amicableNumbers.add(i);
				amicableNumbers.add(total);
			}
		}
		
		return getSetTotal(amicableNumbers);
	}
	
	public static void main(String[] args) {
		Euler21 e = new Euler21();
		System.out.println(e.sumOfAmicable(10000));
	}

}
