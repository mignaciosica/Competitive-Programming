package googleCodeJam;
import java.io.PrintStream;
import java.util.Scanner;

public class Cheating_Detection {

  Scanner             sc       = new Scanner(getClass().getResourceAsStream(IN));
  //Scanner             sc       = new Scanner(System.in);
  static final String FILENAME = "Cheating_Detection";
  static final String IN       = FILENAME + ".in";
  static final String OUT      = FILENAME + ".out";
  PrintStream         out      = System.out;
  int 			      cheater  = 0;
  int 		cheaterScore	   = 0;
  String 			  line     = "";

  private void solve() {
      int count = 1;
	  while(count <= 100) {
	      line = sc.nextLine();
	
	      int ones = 0;
	      for(int i = 0; i < line.length(); i++) {
	    	  if(line.charAt(i) == '1') {
	    		  ones++;
	    	  }
	      }

	      if(ones >= cheaterScore) {
	    	  cheater = count;
	    	  cheaterScore = ones;
	      }
	      count++;
	  }
	  
	  out.println(cheater);
  }

  private void run() throws Exception {
      // out = new PrintStream(new FileOutputStream(OUT));
      int t = sc.nextInt();
      line = sc.nextLine();
      line = sc.nextLine();
      for (int i = 1; i <= t; i++) {
          out.print("Case #" + i + ": ");
          //out.println("/"+line+"/");
          solve();
          cheater = 0;
          cheaterScore = 0;
      }
      sc.close();
      out.close();
  }

  public static void main(String args[]) throws Exception {
      new Cheating_Detection().run();
  }

}