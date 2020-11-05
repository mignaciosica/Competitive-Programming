package projectEuler;

public class PE_010_Summation_of_primes {
	public static void main(String[] args) {
		int n = 1999999;
		int div = 2;
		int sum = 0;
		int i = 1;
		while (n != 1) {
			while (i == 1 && div <= Math.sqrt(n)) {
				if (n % div == 0) {
					i = 0;
				}
				div++;
			}
			if (i == 1) {
				System.out.println(n);
				sum = sum + n;
			}
			div = 2;
			i = 1;
			n--;
		}
		System.out.println(sum);
	}
}
