package projectEuler;

public class AB_AAH_584_1 {

	public static void main(String[] args) {
		
		float promW = 0;
		float promJ = 0;
		float promE = 0;
		
		float lim = 1000000;
	
		for (int i = 0; i < lim; i++) {
			//promW += people(10, 2, 3);
			promJ += people(100, 7, 3);
			//promE += people(365, 7, 4);
		}
		
		System.out.println("Result = " + promW/lim + " / Expected = 5.78688636 / Error = " + (promW/lim - 5.78688636));
		System.out.println("Result = " + promJ/lim + " / Expected = 8.48967364 / Error = " + (promJ/lim - 8.48967364));
		System.out.println("Result = " + promE/lim);
		
		for (int p = 0; p < yt.length; p++) { 
			System.out.print(yt[p]+" ");
		}

	}
	
	public static int [] yt = new int [100];

	public static float people (int n, int d, int s) {
		
		int [] y = new int [n];
		boolean nY = false;
		float people = 0;
		
		int rand;
		
		while(nY == false) {
			people++;
			rand = (int)(Math.random() * n);
			y[rand] += 1;
			
			yt[rand] += 1;
			
			if(ver(y, d, s, rand)) {
				break;
			}
		}
		
		return people;
		
	}
	
public static boolean ver (int [] y, int d, int s, int lp) {
	
		int suma = 0;
		
		for (int i = lp-d+1; i <= lp; i++) {
			for (int ii = 0; ii <= d; ii++) {
				if (i+ii>=0 && i+ii < y.length) {suma += y[i+ii];}
				
				/*for (int p = 0; p < y.length; p++) { 
					System.out.print(y[p]);
				}
				System.out.println(" "+lp);*/
				
				if(suma >= s) {
					return true;
				}
			}
			suma = 0;
		}
		return false;
	}
	
}
