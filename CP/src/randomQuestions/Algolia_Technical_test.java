package randomQuestions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Algolia_Technical_test {

	static HashMap<String, Integer> map;

	public static void main(String[] args) throws IOException {
		long start = System.nanoTime();
		map = new HashMap<>();
		read("C:/Users/P4ssenger/Desktop/hn_logs.tsv", "2015-08-01 00:04");
		System.out.println(map.size());
		long time = System.nanoTime() - start;
		System.out.println(time);
	}

	static void read(String path, String datetime) throws IOException {
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
			inputStream = new FileInputStream(path);
			sc = new Scanner(inputStream, "UTF-8");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				count(line, datetime);
			}
			if (sc.ioException() != null) {
				throw sc.ioException();
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (sc != null) {
				sc.close();
			}
		}
	}

	static void count(String l, String d) {
		String[] line = l.split("\t");
		String datetime = line[0];

		if (!datetime.contains(d))
			return;

		String url = line[1];

		if (map.containsKey(url)) {
			map.replace(url, map.get(url) + 1);
		} else {
			map.put(url, 1);
		}
	}
}
