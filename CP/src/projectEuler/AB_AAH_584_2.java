package projectEuler;

public class AB_AAH_584_2 {

	public static void main(String[] args) {
		float promW = 0, promJ = 0, promE = 0;
		float lim = 100;
		
		for (int i = 0; i < lim; i++) {
			promW += people(10, 2, 3);
			//promJ += people(100, 7, 3);
			//promE += people(365, 7, 4);
		}
		
		//System.out.println("Result = " + promW/lim + " / Expected = 5.78688636 / Error = " + (promW/lim - 5.78688636));
		//System.out.println("Result = " + promJ/lim + " / Expected = 8.48967364 / Error = " + (promJ/lim - 8.48967364));
		//System.out.println("Result = " + promE/lim);
		
		System.out.println(promW/lim - 5.78688636);
		System.out.println(promJ/lim - 8.48967364);
		
		for (int p = 0; p < yt.length; p++) { 
			//System.out.println(yt[p]+" ");
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
		
		
		
		for (int i = lp-d; i <= lp; i++) {
			for (int ii = 0; ii <= d; ii++) {
				if (i+ii>=0 && i+ii < y.length) {suma += y[i+ii];}
				
				if(suma >= s) {
					if (i+ii-1>=0 && y[i+ii]-1!=0) {
						return true;
					}
					/*for (int p = 0; p < y.length; p++) { 
						System.out.print(y[p]);
					}
					System.out.println(" "+lp);*/
				}
			}
			suma = 0;
		}
		return false;
	}
	

}
