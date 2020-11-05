package projectEuler;

//import java.math.BigInteger;
import java.util.Random;

public class AB_AAH_584_0 {

	public static void main(String[] args) {

		float promW = 0;
		float promJ = 0;
		float promE = 0;

		float lim = 100000;

		for (int i = 0; i < lim; i++) {
			promW += people(10, 2, 3);
			promJ += people(100, 7, 3);
			promE += people(365, 7, 4);
		}

		System.out.println(
				"Result = " + promW / lim + " / Expected = 5.78688636 / Error = " + (promW / lim - 5.78688636));
		System.out.println(
				"Result = " + promJ / lim + " / Expected = 8.48967364 / Error = " + (promJ / lim - 8.48967364));
		System.out.println("Result = " + promE / lim);

	}

	public static boolean ver(int[] y, int d, int s, int lp) {

		int suma = 0;

		for (int i = 0; i < y.length - d; i++) {
			for (int ii = 0; ii < d; ii++) {
				suma += y[i + ii];
				if (suma == s) {
					// System.out.println("day "+i+" = "+y[i]+"; day "+(i+ii)+" = "+y[i+ii]+" =>
					// "+suma);
					return true;
				}
			}
			suma = 0;
		}

		/*
		 * for (int i = lp - d; i <= lp + d; i++) { if (y[i] == 0) { continue; } for
		 * (int ii = 0; ii < d; ii++) { suma += y[i+ii]; if( suma == s ) { return true;
		 * } } }
		 */

		return false;
	}

	public static float people(int n, int d, int s) {

		int[] y = new int[n];
		boolean nY = false;
		// int day = 0;
		float people = 0;

		for (int i = 0; i < y.length; i++) {
			y[i] = 0;
		}

		int rand;// = (int)(Math.random() * 10);

		while (nY == false) {
			people++;
			// day = new Random().nextInt(n);
			rand = (int) (Math.random() * n);
			// System.out.println(rand);
			// y[day] += 1;
			y[rand] += 1;
			if (ver(y, d, s, rand)) {
				break;
			}
		}
		return people;

	}

}
