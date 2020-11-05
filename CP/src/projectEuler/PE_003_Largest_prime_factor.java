package projectEuler;

public class PE_003_Largest_prime_factor {
	public static void main(String[] args) {
		long num = 991199L;
		long i = 2;
		while (num != 1) {
			if (num % i == 0) {
				num = num / i;
				System.out.println(i);
				System.out.println(num);
			} else {
				i++;
			}
		}
	}
}
