package projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class AB_AAG_636_0_RestrictedFactorisations {

	public static void main(String[] args) {

		BigInteger n = new BigInteger("25");
		BigInteger p = new BigInteger("1");
		BigInteger m = new BigInteger("0");
		BigInteger r = new BigInteger("1");
		BigInteger d = new BigInteger("2");

		int count = 0;

		ArrayList<Integer> div = new ArrayList<Integer>();

		while (n.compareTo(m) == 1) {
			p = p.multiply(n);
			n = n.subtract(r);
		}

		System.out.println(p);

		while (p.compareTo(r) == 1) {
			if (p.mod(d).intValue() == 0) {
				p = p.divide(d);
				div.add(d.intValue());
				count++;
			} else {
				if (count != 0) {
					System.out.println(d.intValue() + " " + count);
				}
				count = 0;
				d = d.add(r);
			}
		}
		System.out.println(d.intValue() + " " + count);

		int N = 2;
		int i = 0;
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> nPar = new ArrayList<Integer>();
		int numOfPar = 0;
		int max = 1;
		int j = 2;

		while (N <= 4) {
			par.add(1);
			par.add(N - 1);
			while (Collections.frequency(par, 1) != N) {

				if (Collections.frequency(par, 1) == N - Collections.max(par)) {
					nPar.add(N - Collections.max(par) - 1);
					nPar.add(Collections.max(par) - 1);
					par.clear();
					par = nPar;
					nPar.clear();
				}

				if (Collections.frequency(par, 1) == 0) {
					if (Collections.min(par) != 2) {

					} else {
						par.remove(0);
						par.add(1);
						par.add(1);
					}
				}

			}

			while (par.size() > 1) {
				if (Collections.frequency(par, 1) >= j) {
					for (int jj = 0; jj <= j - 1; jj++) {
						par.remove(0);
					}
					par.set(par.lastIndexOf(1), j);

				}

				numOfPar++;
			}
			par.clear();
			i = 0;
			N++;
		}

	}

}
