package euler2;

public class Euler2 {
	
	public long fibonacciSum(long cap) {
		long res = 2;
		for (long pp=1, p=2, t=pp+p; t<cap; t=pp+p, pp=p, p=t) {
			if (t%2 == 0) res+=t;
		}
		return res;
	}

	public static void main(String[] args) {
		Euler2 e = new Euler2();
		System.out.println(e.fibonacciSum(Long.parseLong(args[0])));
	}

}
