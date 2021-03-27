package googleCodeJam;
import java.io.PrintStream;
import java.util.Scanner;

public class Reversort {

  //Scanner             sc       = new Scanner(getClass().getResourceAsStream(IN));
  static Scanner             sc       = new Scanner(System.in);
  //static final String FILENAME = "Reversort";
  //static final String IN       = FILENAME + ".in";
  //static final String OUT      = FILENAME + ".out";
  static PrintStream         out      = System.out;
  static int 		  ans	   = 0;

  private void run() throws Exception {
      int t = sc.nextInt();
      for (int i = 1; i <= t; i++) {
          out.print("Case #" + i + ": ");
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int j = 0; j < n; j++) {
        	  arr[j] = sc.nextInt();
          }
          solve(arr);
      }
      sc.close();
      out.close();
  }
  
  public static void solve(int[] arr) {
      ans = 0;
      ReversortAlgorithm(arr);
      out.println(ans - 1);
  }
  
  private static void ReversortAlgorithm(int[] arr) {
	  for(int i = 0; i < arr.length; i++) {
		  int j = i;
		  for(int ii = i; ii < arr.length; ii++) {
			  if(arr[ii] < arr[j])
				  j = ii;
		  }
		  Reverse(i, j, arr);
		  ans += j - i + 1;
	  }
  }
  
  private static void Reverse(int i, int j, int[] arr) {
	  while(i < j) {
		  int temp = arr[j];
		  arr[j] = arr [i];
		  arr[i] = temp;
		  i++;j--;  
	  }
  } 

  public static void main(String args[]) throws Exception {
      new Reversort().run();
  }

}