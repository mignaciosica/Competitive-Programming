package leetCode;

/*
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 */

public class LC_0402_RemoveKDigits {
	public String removeKdigits(String num, int k) {
		String sol = helper(num, k);
		while (sol.length() > 1 && sol.charAt(0) == '0') {
			String aux = sol.substring(1);
			sol = aux;
		}
		return sol;
	}

	public String helper(String num, int k) {
		if (k == 0)
			return num;
		if (num.length() > 1 && num.charAt(0) == '0')
			return helper(num.substring(1), k);
		if (k >= num.length())
			return "0";

		if (num.charAt(0) - '0' > num.charAt(1) - '0')
			return removeKdigits(num.substring(1), k - 1);

		int j = 1;
		while (j < num.length() && num.charAt(j - 1) - '0' <= num.charAt(j) - '0')
			j++;
		j--;
		return removeKdigits(num.replaceFirst(num.charAt(j) + "", ""), k - 1);
	}
}