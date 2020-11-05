package projectEuler;

public class PE_001_Multiples_of_3_and_5 {
	public static void main(String[] args) {
		int num = 1000;
		int suma = 0;
		num = num - 1;
		while (num != 0) {
			if (num % 3 != 0 && num % 5 != 0) {
				// System.out.println(num+" 1");
				num--;
			} else {
				if (num % 3 == 0 && num % 5 == 0) {
					System.out.println(num + " 2");
					suma = suma + num;
					num--;
				} else {
					System.out.println(num + " 3");
					suma = suma + num;
					num--;
				}
			}
		}
		System.out.println(suma);
	}
}
