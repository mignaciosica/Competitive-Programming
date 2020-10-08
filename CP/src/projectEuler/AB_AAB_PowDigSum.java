package projectEuler;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class AB_AAB_PowDigSum {
	public static void main (String [] args) {
		
//		int[] a = {10,20,30,40,50};
//		int sum = IntStream.of(a).sum();
//		System.out.println("The sum is " + sum);
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(2);
		int[] a = {2,0,0,0,0}; // pow, i, rest
		
		while ( a[0] <= 1000 ) {
			while ( a[1] < list.size()) {
				a[2] = list.get(a[1]) * 2 / 10;
				if(list.get(a[1]) < 5) {
					list.set(a[1], list.get(a[1]) * 2 + a[3]);
				} else {
					a[2] = list.get(a[1]) * 2 / 10;
					if( a[1] + 1 == list.size()) {
						list.add(a[2]);
						a[2] = 0;
						list.set(a[1], (list.get(a[1]) * 2) % 10 + a[3]);
						//System.out.print(list.get(a[1]));
						//System.out.print(list.get(a[1]+1));
						break;
					} else {
						list.set(a[1], (list.get(a[1]) * 2) % 10 + a[3]);
					}
				}
				a[3] = a[2];
				a[2] = 0;
				//System.out.print(list.get(a[1]));
				a[1]++;
			}
			//System.out.println("");
			a[1] = 0;
			a[2] = 0;
			a[3] = 0;
			a[0]++;
		}
		a[0] = 0;
		while ( a[0] < list.size()) {
			a[4] += list.get(a[0]);
			System.out.print(list.get(a[0]));
			a[0]++;
		}
		System.out.print(a[4]);
		
	}
}
