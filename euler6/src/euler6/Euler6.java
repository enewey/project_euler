package euler6;

public class Euler6 {

	public long sumOfSquares(int num) {
		long sum = 0;
		for (int i=1; i<=num; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	public long squareOfSums(int num) {
		long sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		sum = (long) Math.pow(sum, 2);
		return sum;
	}
	
	public static void main(String[] args) {
		Euler6 e = new Euler6();
		System.out.println(e.squareOfSums(100) - e.sumOfSquares(100));
	}

}
