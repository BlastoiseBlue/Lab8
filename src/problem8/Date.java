package problem8;

public class Date {
	private int month;
	private int day;
	private int year;

	public void setMonth(int inputMonth) {
		if (inputMonth > 0 && inputMonth <= 12)
			month = inputMonth;
	}

	public void setMonth(String inputMonth) {
		setMonth(convertMonth(inputMonth));
	}

	public void setDay(int inputDay) {
		if (inputDay > 0 && inputDay <= 31)
			day = inputDay;
	}

	public void setYear(int inputYear) {
		year = inputYear;
	}

	public void setDate(int inputMonth, int inputDay, int inputYear) {
		setMonth(inputMonth);
		setDay(inputDay);
		setYear(inputYear);
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String convertMonth(int inputMonth) {
		switch (inputMonth) {
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
			return null;
		}
	}

	public int convertMonth(String inputMonth) {
		switch (inputMonth.toLowerCase()) {
		case "january":
			return 1;
		case "febuary":
			return 2;
		case "march":
			return 3;
		case "april":
			return 4;
		case "may":
			return 5;
		case "june":
			return 6;
		case "july":
			return 7;
		case "august":
			return 8;
		case "september":
			return 9;
		case "october":
			return 10;
		case "november":
			return 11;
		case "december":
			return 12;
		default:
			return 0;
		}
	}

	public String outputDate() {
		return month + "/" + day + "/" + year;
	}

	public String outputDateString() {
		return convertMonth(month) + " " + day + ", " + year;
	}

	Date() {
		setMonth(1);
		setDay(1);
		setYear(1000);
	}

	Date(int inputMonth, int inputDay, int inputYear) {
		setMonth(inputMonth);
		setDay(inputDay);
		setYear(inputYear);
	}

	Date(String inputMonth, int inputDay, int inputYear) {
		setMonth(inputMonth);
		setDay(inputDay);
		setYear(inputYear);
	}
}