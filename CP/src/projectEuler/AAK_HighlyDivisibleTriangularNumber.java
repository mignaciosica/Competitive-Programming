package projectEuler;

public class AAK_HighlyDivisibleTriangularNumber {
	public static void main (String [] args){
		int num = 1;
		int cantDiv = 0;
		int A = 1;
		int a = 1;
		int div = 2;
		while (cantDiv<500){
			num=0;
			cantDiv=2;
			a=A;
			while(a!=0){
				num = num + a;
				a--;
			}
			while(div<=Math.sqrt(num)){
				if(num%div==0){
					cantDiv = cantDiv+2;
					if(div==Math.sqrt(num)){
						cantDiv--;
					}
				}div++;
			}
			div=2;
			System.out.println(cantDiv);
			A++;
		}System.out.println(num+" "+A);
	}
}
