package problem4;

public class Date {
	int month;
	int day;
	int year;

	public void setDate(int inputMonth, int inputDay, int inputYear) {
		month = inputMonth;
		day = inputDay;
		year = inputYear;
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
