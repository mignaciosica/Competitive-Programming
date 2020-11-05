package projectEuler;

public class AB_AAC_NumLettCount {

	public static void main(String[] args) {
		// 3 3 5 4 4 3 5 5 4 3 6 6 8 8 7 7 9 8 8
		int[] val1_19 = { 0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8 };
		// 6 6 5 5 5 7 6 6
		int[] val20_90 = { 0, 0, 6, 6, 5, 5, 5, 7, 6, 6 };

		int num = 1;
		int sum = 0;

		while (num < 1000) {
			if (num > 99) {
				if (num % 100 == 0) {
					sum += val1_19[num / 100] + 7;
				} else if (num % 10 == 0 && num % 100 > 19) {
					sum += val1_19[num / 100] + 7 + 3 + val20_90[(num % 100) / 10];
				} else if (num % 100 > 19) {
					sum += val1_19[num / 100] + 7 + 3 + val20_90[(num % 100) / 10] + val1_19[num % 10];
				} else {
					sum += val1_19[num / 100] + 7 + 3 + val1_19[num % 100];
				}
			} else if (num > 19) {
				if (num % 10 == 0) {
					sum += val20_90[num / 10];
				} else {
					sum += val20_90[num / 10] + val1_19[num % 10];
				}
			} else {
				sum += val1_19[num];
			}
			num++;
		}

		System.out.println(sum + 11);

		// hundred

	}

}

/*
 * 3 one 3354435543668877988 3 two 5 three 4 four 4 five 3 six 5 seven 5 eight 4
 * nine 3 ten 6 eleven 6 twelve 8 thirteen 8 fourteen 7 fifteen 7 sixteen 9
 * seventeen 8 eighteen 8 nineteen
 * 
 * 6 twenty 66555766 7 11 6 thirty 5 forty 5 fifty 5 sixty 7 seventy 6 eighty 6
 * ninety 7 hundred 11 onethousand
 */