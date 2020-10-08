package projectEuler;

public class PE_002_Even_Fibonacci_Numbers {
	public static void main (String[]args){
		int num = 1;
		int ant = 0;
		int suma = 0;
		while (num<4000000){
			if(num%2==0){
				suma = suma + num;
			}
			num  = num + ant;
			ant = num - ant;
		}
		System.out.println(suma);
	}
}
