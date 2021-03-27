package googleCodeJam;
import java.io.PrintStream;
import java.util.Scanner;

public class Moons_And_Umbrellas {

  //Scanner             sc       = new Scanner(getClass().getResourceAsStream(IN));
	Scanner             sc       = new Scanner(System.in);
  //static final String FILENAME = "Moons and Umbrellas";
  //static final String IN       = FILENAME + ".in";
  //static final String OUT      = FILENAME + ".out";
    PrintStream         out      = System.out;

    private void solve() {
    	int ans = 0;
        int X = sc.nextInt();
        int Y = sc.nextInt();
        String mural = sc.next();
        
        mural = mural.replace("?", "");
        
        //out.println(X+" "+Y+" "+mural);
        
        char[] ch = mural.toCharArray();
        for(int i = 0; i < ch.length-1; i++) {
        	if(ch[i] == ch[i+1])
        		continue;
        	
        	ans += ch[i]=='C' ? X : Y;
        }
        
        out.println(ans);
    }

    private void run() throws Exception {
        //out = new PrintStream(new FileOutputStream(OUT));
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            out.print("Case #" + i + ": ");
            solve();
        }
        sc.close();
        out.close();
    }

    public static void main(String args[]) throws Exception {
        new Moons_And_Umbrellas().run();
    }

}