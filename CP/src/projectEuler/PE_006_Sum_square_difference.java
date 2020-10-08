package projectEuler;

public class PE_006_Sum_square_difference {
	public static void main (String [] args){
		int i = 1;
		int numChic = 0;
		int numGran = 0;
		while (i <= 100){
			numChic = i*i+numChic;
			System.out.println(numChic+" C");
			numGran = numGran+i;
			System.out.println(numGran+" G");
			i++;
		}
		System.out.println((numGran*numGran)-numChic);
	}
}
