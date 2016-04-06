package easter;

public class Easter {

	Easter() {
	}

	public static String calculateEaster(int aYear) {

		int Year = aYear;
		int Month;
		int Day;

		int a = Year % 19;
		int b = Year % 4;
		int c = Year % 7;

		// why 24?
		int d = (19 * a + 24) % 30;
		int e = (2 * b + 4 * c + 6 * d + 5) % 7;

		if (d + e < 10) {
			Month = 3;
			Day = d + e + 22;
		} else {
			Month = 4;
			Day = d + e - 9;
		}

		if (Month == 4 && Day == 26) {
			Month = 4;
			Day = 19;
		} else if (Month == 4 && Day == 25 && d == 28 && e == 6 && a > 10) {
			Month = 4;
			Day = 18;
		}
		return "In" + Year + ", Easter Sunday is: montn=" + Month + " and day=" + Day;
	}

}
