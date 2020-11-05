package projectEuler;

import java.util.ArrayList;

public class AB_AAD_PrimePerm {

	public static void main(String[] args) {

		int prime = 1001;
		int div = 3;
		boolean isPrime = true;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (prime < 10000) {
			while (div <= Math.sqrt(prime)) {
				if (prime % div == 0) {
					isPrime = false;
					break;
				}
				div++;
			}
			if (isPrime == true) {
				list.add(prime);
			}
			isPrime = true;
			div = 3;
			prime += 2;
		}

		prime = 0;
		while (prime < list.size()) {
			System.out.println(list.get(prime));
			prime++;
		}

		System.out.print(list.size());

	}

}
