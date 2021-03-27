package googleCodeJam;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Reversort_Engineering {

  Scanner             sc       = new Scanner(getClass().getResourceAsStream(IN));
  //Scanner             sc       = new Scanner(System.in);
  static final String FILENAME = "Reversort_Engineering";
  static final String IN       = FILENAME + ".in";
  static final String OUT      = FILENAME + ".out";
  PrintStream         out      = System.out;
  static int 		  obj	   = 0;

  private void run() throws Exception {
      int t = sc.nextInt();
      for (int i = 1; i <= 100; i++) {
          out.print("Case #" + i + ": ");
          
          //int n = sc.nextInt();
          int n = ThreadLocalRandom.current().nextInt(2, 99 + 1);
          out.print(n+" ");
          int[] arr = new int[n];
          
          for(int j = 0; j < n; j++) {
        	  arr[j] = j + 1;
          }
          
          //obj = sc.nextInt();
          obj = ThreadLocalRandom.current().nextInt(2, 999 + 1);
          out.print(obj+" ");
          
          if(obj < n - 1) {
        	  out.println("IMPOSSIBLE");
        	  continue;
          }
          
          obj -= n-1;
          if(obj == 0) { 
			  printAns(arr);
			  continue;
          }
          
          solve(arr);
      }
      sc.close();
      out.close();
  }
  
  private void solve(int[] arr) {
      ReversortAlgorithmB(arr);
  }
  
  private void ReversortAlgorithmB(int[] arr) {
	  int cost = 2;
	  
	  while(cost < arr.length) {
		  if(obj == 0) {
			  printAns(arr);
			  return;
		  }
		  
		  if(obj < arr.length && obj >= cost) {
			  Reverse(arr.length - obj - 1, arr.length - 1, arr);
			  printAns(arr);
			  return;
		  } else if (obj < cost){
			  out.println("IMPOSSIBLE");
			  return;
		  } else {
			  Reverse(arr.length - cost - 1, arr.length - 1, arr);
			  obj -= cost;
		  }
		  cost++;
	  }
	  
	  out.println("IMPOSSIBLE");
  }
  
  private void Reverse(int i, int j, int[] arr) {
	  while(i < j) {
		  int temp = arr[j];
		  arr[j] = arr [i];
		  arr[i] = temp;
		  i++;j--;  
	  }
  } 
  
  private void printAns(int[] arr) {
	  for(int i = 0; i < arr.length; i++) {
		  //out.print(arr[i] + " ");
	  }
	  //out.println("");
	  Reversort.solve(arr);
  }

  public static void main(String args[]) throws Exception {
      new Reversort_Engineering().run();
  }

}