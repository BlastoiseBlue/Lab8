package problem8;

public class Date {
	int month;
	int day;
	int year;

	public void setDate(int inputMonth, int inputDay, int inputYear) {
		month = inputMonth;
		day = inputDay;
		year = inputYear;
	}

	public String getMonth() {
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Error: invalid month";
		}
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