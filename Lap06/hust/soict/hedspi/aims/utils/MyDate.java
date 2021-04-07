package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.util.Scanner;
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		String[] todayStr = LocalDate.now().toString().split("-");
		setYear(Integer.parseInt(todayStr[0]));
		setMonth(Integer.parseInt(todayStr[1]));
		setDay(Integer.parseInt(todayStr[2]));
	}
	
	public MyDate(int day, int month, int year) {
		int day_pred = checkDay(month, year);
		if (day_pred == 0 || 0 >= day || day > day_pred) {
			System.out.println("Ngày tháng năm nhập sai!!!");
			return;
		}
		else {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
	}
	
	public MyDate(String date) {
		stringToDate(date);
	}
	
	public MyDate(String day, String month, String year) {
        int d =0 ,m = 0,y = -1;
        for (int i = 0 ; i < validDay.length ; i++){
            if(day.toLowerCase().equals(validDay[i])) {
                d = i + 1;
                break;
            }
        }
        m = checkMonth(month);
        y = yearStringToInt(year);
        if((d != 0 && d <= checkDay(m,y)) && m != 0 && y !=-1){
            this.day = d;
            this.month = m;
            this.year = y;
        }
        else{
            if(d == 0 || d > checkDay(m,y) )
                System.out.println("Error : Invalid day");
            if(m == 0)
                System.out.println("Error : Invalid month");
            if (y < 0)
                System.out.println("Error : Invalid year");
        }
    }
	
    public int yearStringToInt(String year){
        String y = year.toLowerCase();
        String[] itemsY = y.split("\\s");
        if(itemsY.length < 2) {
            return -1;
        }
        int num1,num2;
        num1 = cutStringYear(itemsY[0]);
        if(num1 == -1)
            return -1;
        num2 = cutStringYear(itemsY[1]);
        if(num2 == -1 && itemsY[1].equals("hundred"))
            num2 = 0;
        else if(num2 == -1 && !itemsY[1].equals("hundred"))
            return -1;
        return num1*100 + num2;
    }
	
    public int cutStringYear (String cutItem){
        String[] numType1 = {"one","two","three","four","five","six","seven","eight","nine"};
        String[] numType2 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] numType3 = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int num1=0,num2=0;
        int flag = 0;
        if(!cutItem.contains("-")){
            for (int i = 0 ; i < numType1.length ; i++){
                if(numType1[i].equals(cutItem)){
                    num1 = i + 1;
                    num2 = 0 ;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int i = 0 ; i < numType2.length ; i++){
                    if(numType2[i].equals(cutItem)){
                        num1 = 1;
                        num2 = i ;
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                for (int i = 0 ; i < numType3.length ; i++){
                    if(numType3[i].equals(cutItem)){
                        num1 = i + 2;
                        num2 = 0 ;
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 0 )
                return -1;
        }
        else{
            String[] itemsArr = cutItem.split("-");
            if (itemsArr.length < 2){
                return -1;
            }

            for (int i = 0 ; i < numType3.length ; i++){
                if(numType3[i].equals(itemsArr[0])){
                    num1 = i + 2;
                    break;
                }
            }
            if(num1 == 0 )
                return -1;
            for (int i = 0 ; i < numType1.length ; i++){
                if(numType1[i].equals(itemsArr[1])){
                    num2 = i + 1;
                    break;
                }
            }
            if(num2 == 0)
                return -1;

        }
        return num1*10 + num2;
    }
    
	public void stringToDate(String date) { // yy/mm/dd eg: 2019/Feb/1st
		String[] dayStr = date.split("/");
		int year = Integer.parseInt(dayStr[0]);
		int month = checkMonth(dayStr[1]);
		int day = 0;
		int lengthDay = dayStr[2].length();
		if (lengthDay == 1 || lengthDay == 2)
			day = Integer.parseInt(dayStr[2]);
		if (lengthDay == 3) 
			day = Integer.parseInt(dayStr[2].substring(0, 1));
		if (lengthDay == 4) 
			day = Integer.parseInt(dayStr[2].substring(0, 2));
		
		int day_pred = checkDay(month, year);
		if (day_pred == 0 || 0 >= day || day > day_pred) {
			System.out.println("Ngày tháng năm nhập sai!!!");
			return;
		}
		else {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
	}
	
	public void accept() {
		System.out.println("Nhập ngày tháng theo địnnh dạng yy/mm/dd (eg: 1234/May/6th): ");
		try (Scanner scanner = new Scanner(System.in)) {
			String date = scanner.nextLine();
			stringToDate(date);
		}
	}
	
	public String print(){
		String date = new String();
		String months[] = {"", "January ", "February ", "March ", "April ", "May ",
                "June ", "July ", "August ", "September ", "October ",
                "November ", "December "};
		date += months[this.getMonth()] + this.getDay();
		if (this.getDay() == 1 || this.getDay() == 21)
			date += "st ";
		if (this.getDay() == 2 || this.getDay() == 22)
			date += "nd ";
		if (this.getDay() == 3 || this.getDay() == 23)
			date += "rd ";
		else
			date += "th ";
		
		return date + this.getYear();
	}
	
	public String print(int roll) {
		String months[] = {"", "January ", "February ", "March ", "April ", "May ",
                "June ", "July ", "August ", "September ", "October ",
                "November ", "December "};
		String day_int = (this.day > 9) ? this.day + "" : "0" + this.day;
        String month_int = (this.month > 9) ? this.month + "" : "0" + this.month;
        String month_string = months[this.getMonth()].substring(0,3);
        switch (roll){
            case 1:
                return "My Date (yyyy-MM-dd): " + this.year + "-" + month_int + "-" + day_int;
            case 2:
                return "My Date (d/M/yyyy): " + this.day + "/" + this.month + "/" + this.year;
            case 3:
                return "My Date (dd-MMM-yyyy): " + day_int + "-" + month_string + "-" + this.year;
            case 4:
                return "My Date (MMM d yyyy): " + month_string + " " + this.day + " " + this.year;
            case 5:
                return "My Date (mm-dd-yyyy): " + month_int + "-" + day_int + "-" + this.year;
            default:
                return print();
        }
	}
	
	
	public boolean checkYear(int a) {
		return (a <= 0);
	}
	
	public boolean isLeap(int year) {
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
           return false;
	}
	
	public int checkMonth(String mont) {
		if(mont.equals("1") || mont.equals("January") || mont.equals("Jan.") || mont.equals("Jan"))
			return 1;
		if(mont.equals("2") || mont.equals("February") || mont.equals("Feb.") || mont.equals("Feb"))
			return 2;
		if(mont.equals("3") || mont.equals("March") || mont.equals("Mar.") || mont.equals("Mar"))
			return 3;
		if(mont.equals("4") || mont.equals("April") || mont.equals("Apr.") || mont.equals("Apr"))
			return 4;
		if(mont.equals("5") || mont.equals("May"))
			return 5;
		if(mont.equals("6") || mont.equals("June") || mont.equals("Jun"))
			return 6;
		if(mont.equals("7") || mont.equals("July") || mont.equals("Jul"))
			return 7;
		if(mont.equals("8") || mont.equals("August") || mont.equals("Aug.") || mont.equals("Aug"))
			return 8;
		if(mont.equals("9") || mont.equals("September") || mont.equals("Sept.") || mont.equals("Sep"))
			return 9;
		if(mont.equals("10") || mont.equals("October") || mont.equals("Oct.") || mont.equals("Oct"))
			return 10;
		if(mont.equals("11") || mont.equals("November") || mont.equals("Nov.") || mont.equals("Nov"))
			return 11;
		if(mont.equals("12") || mont.equals("December") || mont.equals("Dec.") || mont.equals("Dec"))
			return 12;
		else
			return 0;
	}
	
	public int checkDay(int month, int year) {
		if (checkYear(year)) return 0;
		boolean is_leap = isLeap(year);
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 2 && is_leap == true)
			return 29;
		if (month == 2 && is_leap == false)
			return 28;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		return 0;
	}
    
    private String[] validDay = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth","thirteenth","fourteenth",
            "fifteen","sixteenth","seventeenth","eighteenth","nineteenth","twentieth","twenty-first","twenty-second","twenty-third","twenty-fourth","twenty-fifth","twenty-sixth",
            "twenty-seventh","twenty-eighth","twenty-ninth","thirtieth","thirty-first"};
    
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

