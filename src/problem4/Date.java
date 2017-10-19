package problem4;

public class Date {
	private int month;
	private int day;
	private int year;

	public void setDate(int inputMonth, int inputDay, int inputYear) {
		month = inputMonth;
		day = inputDay;
		year = inputYear;
	}

	public int getDay() {
		return day;
	}

	public int getMonthInt() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String outputDate() {
		return month + "/" + day + "/" + year;
	}

	Date() {

	}

	Date(int inputMonth, int inputDay, int inputYear) {
		month = inputMonth;
		day = inputDay;
		year = inputYear;
	}
}
