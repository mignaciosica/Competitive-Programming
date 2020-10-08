package projectEuler;

import java.util.ArrayList;

public class AB_AAG_636_1_Partitions {
	
	public static int Partitions (int n) {
		
		ArrayList<Integer> par = new ArrayList<Integer>();
		
		par.add(1);
		par.add(1);
		int sumN = 0;

		while(par.size() <= n) {
			
			for(int j = 1; j <= par.size(); j++) {
				
				sumN += a(j) * par.get(par.size()-j);
				
			}
			
			par.add(-sumN);
			sumN = 0;
			
		}
	
		return par.get(par.size()-1);
		
	}
	
	public static int a(int i) {
		
		ArrayList<Integer> listN = new ArrayList<Integer>();
		ArrayList<Integer> listR = new ArrayList<Integer>();
		
		float r = 1;
		
		while (r <= i+5) {
			if ((r*(3*r+1)/2)%1 == 0 && (r*(3*r-1)/2)%1 == 0) {
				listR.add( (int) r );
				listN.add( (int) (r*(3*r+1)/2) );
				listR.add( (int) r );
				listN.add( (int) (r*(3*r-1)/2) );
			}
			r++;
		}
		
		if(i == 0) { return 1; }
		
		else if (listN.contains(i)) { return (int) Math.pow(-1, (double) listR.get(listN.indexOf(i))); } 
		
		else { return 0; }

	}
	
	public static void main (String [] args) {
		long startTime = System.nanoTime();
		
		System.out.println(Partitions(800));
		
		long endTime = System.nanoTime();
		//System.out.println("Took "+(endTime - startTime) + " ns");
		System.out.println("Took "+(endTime - startTime) / 1000000000 +"."+ ((endTime - startTime) % 1000000000)+" s"); 	
	}
}