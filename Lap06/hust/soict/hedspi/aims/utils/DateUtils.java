package hust.soict.hedspi.aims.utils;

public class DateUtils {

	 public static int compare(MyDate d1, MyDate d2) {
	       	        
	        if (d1.getYear() > d2.getYear()) {
	            return 1;
	        } else if (d1.getYear() < d2.getYear()) {
	            return -1;
	        } else {
	            if (d1.getMonth() > d2.getMonth()) {
	                return 1;
	            } else if (d1.getMonth() < d2.getMonth()) {
	                return -1;
	            } else { 
	                if (d1.getDay() > d2.getDay()) {
	                    return 1;
	                } else if (d1.getDay() < d2.getDay()) {
	                    return -1;
	                } else { 
	                    return 0;
	                }
	            }
	        }
	    }
	    
	    public static void sortDates(MyDate[] dates) {
	        for (int i = 0; i < dates.length - 1; i++) {
	            for (int j = i + 1; j < dates.length; j++) {
	                if (compare(dates[i], dates[j]) == 1) {
	                	MyDate tmp = dates[i];
	                    dates[i] = dates[j];
	                    dates[j] = tmp;
	                }
	            }
	        }
	    }
	}
