package euler15;

import java.math.BigInteger;

public class Euler15 {

	static final int size = 20;
	
	public BigInteger fact(int num) {
		return factRecur(num, new BigInteger("1"));
	}
	public BigInteger factRecur(int num, BigInteger acc) {
		if (num == 1) return acc;
		else return factRecur(num - 1, acc.multiply(new BigInteger(Integer.toString(num))));
	}
	
	public static void main(String[] args) {
		Euler15 e = new Euler15();
		System.out.println(e.fact(size*2).divide(e.fact(size).multiply(e.fact(size))));
	}
}
