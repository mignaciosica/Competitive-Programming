package projectEuler;

public class PE_007_10001st_Primes {
	public static void main(String[] args) {
		double num = 2;
		int i = 0;
		int b = 2;
		boolean esPrimo = true;
		while (i < 10001) {
			while (b <= Math.sqrt(num) && esPrimo == true) {
				if (num % b == 0) {
					esPrimo = false;
				} else {
					b++;
				}
			}
			if (esPrimo == true) {
				i++;
				// System.out.println(num +" "+i);
			}
			b = 2;
			esPrimo = true;
			num++;
		}
		System.out.println(num + " " + i);
	}
}
