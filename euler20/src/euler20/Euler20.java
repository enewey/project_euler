package euler20;

import java.math.BigInteger;

public class Euler20 {

	// -- code taken from my solution of euler15
	public BigInteger fact(int num) {
		return factRecur(num, new BigInteger("1"));
	}
	public BigInteger factRecur(int num, BigInteger acc) {
		if (num == 1) return acc;
		else return factRecur(num - 1, acc.multiply(new BigInteger(Integer.toString(num))));
	}
	// --
	
	public static void main(String[] args) {
		Euler20 e = new Euler20();
		String hundredFactorial = e.fact(100).toString();
		int tot = 0;
		for (int i=0; i<hundredFactorial.length(); i++) {
			tot += Integer.parseInt(hundredFactorial.substring(i, i+1));
		}
		System.out.println(tot);
	}

}
