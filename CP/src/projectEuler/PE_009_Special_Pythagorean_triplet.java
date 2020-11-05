package projectEuler;

public class PE_009_Special_Pythagorean_triplet {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		double c = -1;
		for (int n = 0; n < 998; n++) {
			for (int i = 0; i < 998; i++) {
				c = a * a + b * b;
				if (Math.sqrt(c) % 1 == 0) {
					c = Math.sqrt(c);
					// System.out.println("a= "+a+"; b= "+b+"; c= "+c);
					if (a + b + c == 1000) {
						System.out.println("a= " + a + "; b= " + b + "; c= " + c);
						System.out.println(a * b * c);
					}
				}
				b = b + 1;
			}
			a = a + 1;
			b = 1;
		}
		// double ab = (double) Math.sqrt(5);
		// System.out.println(ab);
	}
}
