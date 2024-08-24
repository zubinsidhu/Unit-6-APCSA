import java.util.Scanner;
public class PrintCalender {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full year (e.g., 2021): ");
		int year = input.nextInt();
		System.out.print("Enter month as a number (1 - 12): ");
		int month = input.nextInt();
		input.close();
		
		printMonth(year, month);
		
		for (int m = 1; m <= 12; m++) {
			System.out.println();
			printMonth(2022, m);
			System.out.println();
		}
	}
	
	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	public static void printMonthTitle(int year, int month) {
		System.out.printf("\n%14s   %-11d\n", getMonthName(month), year);
		
		for (int i = 0; i < 28; i++) {
			System.out.print('-');
		}
		System.out.printf("\n%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
	}
	public static void printMonthBody(int year, int month) {
		int firstDay = getStartDay(year, month);
		for (int d = 0; d < firstDay; d++) {
			System.out.printf("%4s", " ");
		}
		for (int d = 1; d <= getNumberOfDaysInMonth(year, month); d++) {
			if ((d + firstDay) % 7 == 0) {
				System.out.printf("%4d\n", d);
			}
			else {
				System.out.printf("%4d", d);
			}
		}
	}
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December"; break;
		default: System.out.print("Invalid month number");
		}
		return monthName;
	}
	public static int getStartDay(int year, int month) {
		final int START_DAY_OF_JAN_1_1800 = 3;
		int daySince = getTotalNumberOfDays(year, month);
		return (START_DAY_OF_JAN_1_1800 + daySince) % 7;
	}
	public static int getTotalNumberOfDays(int year, int month) {
		int sum = 0;
		for (int y = 1800; y < year; y++) {
			sum += isLeapYear(y) ? 366 : 365;
		}
		for (int m = 1; m < month; m++) {
			sum += getNumberOfDaysInMonth(year, m);
		}
		return sum;
	}
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		else if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		}
		else {
			return 30;
		}
	}
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}