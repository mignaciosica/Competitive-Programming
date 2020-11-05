package projectEuler;

public class PE_019_Counting_Sundays {
	public static void main(String[] args) {

		int count = 0;
		int year = 1901;
		int sP = 5; // The First day of the year in 1901 was a Wednesday
		int days = 365;

		int[] foM = { 1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335 };
		// Number of the first day of each month
		int[] foML = { 1, 32, 61, 92, 122, 153, 183, 214, 245, 275, 306, 336 };

		while (year <= 2000) {
			if (year % 4 == 0 && year % 400 != 0) { // verifies if the year is a leap year
				days = 366;
				for (int i : foML) {
					if ((i + 6 - sP) % 7 == 0) { // for each starting day, it verifies if it is a multiple of seven
						count++;
					}
				}
			} else {
				days = 365;
				for (int i : foM) {
					if ((i + 6 - sP) % 7 == 0) {
						count++;
					}
				}
			}
			sP = 7 - ((days - sP) % 7); // Calculates the starting day of the next year
			year++;
		}
		System.out.println(count);

	}
}
