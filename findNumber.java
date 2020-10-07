public class FindNumber{
	static int findNumber (int[]numbs){
		int n = numbs.length + 1;
		int sum = n * (n+1) / 2;
		for(int i = 0; i < n - 1; i++){
			sum -= numbs[i];
		}
		return sum;
	}
}
