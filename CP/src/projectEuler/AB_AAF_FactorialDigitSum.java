package projectEuler;

import java.math.BigInteger;

public class AB_AAF_FactorialDigitSum {
	
	public static void main (String [] args) {
		
		BigInteger n = new BigInteger("25");
		BigInteger p = new BigInteger("1");
		BigInteger m = new BigInteger("0");
		BigInteger r = new BigInteger("1");
		
		while (n.compareTo(m) == 1) {
			p = p.multiply(n);
			n = n.subtract(r);
		}
		
		System.out.println(p);
		
		int sum = 0;
		for(char c : p.toString().toCharArray()) {
			sum += Character.getNumericValue(c);
		}
		System.out.println(sum);
	}

}
