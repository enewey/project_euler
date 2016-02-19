package euler1;

import java.util.HashSet;

public class euler1 {
	
	public Integer[] getMultiplesOf3or5(int num) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=3; i<num; i+=3) set.add(i);
		for (int i=5; i<num; i+=5) set.add(i);
		return set.toArray(new Integer[0]);
	}
	
	public int sumArray(Integer[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Wrong args length");
			return;
		}
		euler1 e = new euler1();
		System.out.println(e.sumArray(e.getMultiplesOf3or5(Integer.parseInt(args[0]))));
	}

}
