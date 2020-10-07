package randomQuestions;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] numbsA = {1,7,6,3,5,2};
		System.out.println(findMissingNumber(numbsA));
		int[] numbsB = {1};
		System.out.println(findMissingNumber(numbsB));
		int[] numbsC = {2};
		System.out.println(findMissingNumber(numbsC));
		int[] numbsD = {};
		System.out.println(findMissingNumber(numbsD));
	}
	
	static int findMissingNumber (int[]numbs){
		int n = numbs.length + 1;
		int sum = n * (n+1) / 2;
		for(int i = 0; i < n - 1; i++){
			sum -= numbs[i];
		}
		return sum;
	}
}
