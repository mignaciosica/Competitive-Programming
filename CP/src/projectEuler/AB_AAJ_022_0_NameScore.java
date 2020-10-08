package projectEuler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class AB_AAJ_022_0_NameScore {
	
	private static Paths pathB;
	
	public static void main (String [] args) throws UnsupportedEncodingException, IOException {
		long startTime = System.nanoTime();
		
		String [] names;
		
		String path = "p022_names.txt";
		String content = new String(Files.readAllBytes(pathB.get(path)), "UTF-8");
		
		content = content.replaceAll("\"", "");
		names = content.split(",");	
		Arrays.sort(names);
		
		int nameScores = 0;
		
		for (int i = 0; i <= names.length-1; i++) {
			nameScores += worth(names[i]) * (i+1);
		}
		
		System.out.println(nameScores);
		
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) / 1000000000 +"."+ ((endTime - startTime) % 1000000000)+" s");
	}
	
	static int worth (String name) {
		int worth = 0;
		String abc = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (char l : name.toCharArray()) {
			worth += abc.indexOf(l);
		}
		
		return worth;
	}
	
}