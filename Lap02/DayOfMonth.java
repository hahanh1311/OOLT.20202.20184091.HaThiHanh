package Lap02;

import java.util.Scanner;

public class DayOfMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		int day = 0;
		String mont = null;
		while (month == 0) {
			System.out.println("input month: ");
			mont = sc.next();

			if (mont.equals("1") || mont.equals("January") || mont.equals("Jan.") || mont.equals("Jan"))
				month = 1;
			if (mont.equals("2") || mont.equals("February") || mont.equals("Feb.") || mont.equals("Feb"))
				month = 2;
			if (mont.equals("3") || mont.equals("March") || mont.equals("Mar.") || mont.equals("Mar"))
				month = 3;
			if (mont.equals("4") || mont.equals("April") || mont.equals("Apr.") || mont.equals("Apr"))
				month = 4;
			if (mont.equals("5") || mont.equals("May"))
				month = 5;
			if (mont.equals("6") || mont.equals("June") || mont.equals("Jun"))
				month = 6;
			if (mont.equals("7") || mont.equals("July") || mont.equals("Jul"))
				month = 7;
			if (mont.equals("8") || mont.equals("August") || mont.equals("Aug.") || mont.equals("Aug"))
				month = 8;
			if (mont.equals("9") || mont.equals("September") || mont.equals("Sept.") || mont.equals("Sep"))
				month = 9;
			if (mont.equals("10") || mont.equals("October") || mont.equals("Oct.") || mont.equals("Oct"))
				month = 10;
			if (mont.equals("11") || mont.equals("November") || mont.equals("Nov.") || mont.equals("Nov"))
				month = 11;
			if (mont.equals("12") || mont.equals("December") || mont.equals("Dec.") || mont.equals("Dec"))
				month = 12;

		}

		int year = -1;
		while (year < 0) {
			System.out.print("Input a year: ");
			year = sc.nextInt();

		}
		

		switch (month) {
		case 1:
			day = 31;
			break;
		case 2:
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		case 3:
			day = 31;
			break;
		case 4:
			day = 30;
			break;
		case 5:
			day = 31;
			break;
		case 6:
			day = 30;
			break;
		case 7:
			day = 31;
			break;
		case 8:
			day = 31;
			break;
		case 9:
			day = 30;
			break;
		case 10:
			day = 31;
			break;
		case 11:
			day = 30;
			break;
		case 12:
			day = 31;
		}
		System.out.print(+day + " days\n");

	}

}
