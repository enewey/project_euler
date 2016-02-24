package euler16;

import java.math.BigInteger;

public class Euler16 {
	
	public static void main(String[] args) {		
		BigInteger big = new BigInteger("2").pow(1000);
		String ch = big.toString();
		long acc = 0;
		for (int i=0; i<ch.length(); i++) {
			acc += Integer.parseInt(ch.substring(i, i+1));
		}
		System.out.println(acc);	
	}
}
