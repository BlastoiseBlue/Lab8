/*
 * Emmet Stanevich
 * 10/17/17
 * Problem 8
 */
package problem8;

public class Driver {

	public static void main(String[] args) {
		Date date1 = new Date(6, 13, 1999);
		Date date2 = new Date();
		Date date3 = new Date("OcToBeR", 31, 2017);
		System.out.println("Date 1:");
		System.out.println(date1.outputDate());
		System.out.println(date1.outputDateString());
		System.out.println(date1.convertMonth(date1.getMonth()));
		System.out.println("Date 2:");
		System.out.println(date2.outputDate());
		System.out.println(date2.outputDateString());
		System.out.println(date2.getYear());
		System.out.println("Date 3:");
		System.out.println(date3.outputDate());
		System.out.println(date3.outputDateString());
		System.out.println(date3.getDay());
	}

}
