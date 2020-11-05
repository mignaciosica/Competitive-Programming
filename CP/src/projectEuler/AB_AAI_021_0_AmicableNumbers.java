package projectEuler;

public class AB_AAI_021_0_AmicableNumbers {

	public static void main(String[] args) {
		int sumTot = 0;
		int[] aN = new int[100000];

		for (int i = 1; i <= 10000; i++) {
			aN[i] = sumDiv(i);
			if (sumDiv(i) < 10000 && i == aN[sumDiv(i)] && i != sumDiv(i)) {
				sumTot += i + sumDiv(i);
				System.out.println(i + " " + sumDiv(i));
			}
		}

		System.out.println(sumTot);

	}

	static int sumDiv(int n) {
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum += i;
				if (i != Math.sqrt(n)) {
					sum += (n / i);
				}
			}
		}
		return sum;
	}
}
