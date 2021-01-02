package com.wallaceespindola.companies;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class TestTomTomCodilityFullWeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test TomTom Codility...");
		
		TestTomTomCodilityFullWeeks test = new TestTomTomCodilityFullWeeks();
		
		System.out.println("solution: " + test.solution(2014, "April", "May", "Wednesday")); // return 7
	}

	public int solution(int Y, String A, String B, String W) {
		
		Map<String, Integer> months = new HashMap<String, Integer>();//Autobox/Autounbox on integers
		months.put("January", 	0);
		months.put("February", 	1);
		months.put("March", 	2);
		months.put("April", 	3);
		months.put("May", 		4);
		months.put("June", 		5);
		months.put("July", 		6);
		months.put("August", 	7);
		months.put("September", 8);
		months.put("October", 	9);
		months.put("November", 	10);
		months.put("December", 	11);

	    Calendar calA = new GregorianCalendar();
	    calA.set(Calendar.YEAR, Y);
	    calA.set(Calendar.MONTH, months.get(A));
	    calA.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	    calA.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
	    calA.set(Calendar.HOUR_OF_DAY, 0);
	    calA.set(Calendar.MINUTE, 0);
	    calA.set(Calendar.SECOND, 0);
	    calA.set(Calendar.MILLISECOND, 0);
	    Date dateA = calA.getTime();
	    
	    System.out.println("DateA: " + dateA);

//	    Calendar calB = new GregorianCalendar();
//	    calB.set(Calendar.YEAR, Y);
//	    calB.set(Calendar.MONTH, months.get(B));
//	    calB.set(Calendar.DATE, calB.getActualMaximum(Calendar.DATE));
//	    calB.set(Calendar.HOUR_OF_DAY, 0);
//	    calB.set(Calendar.MINUTE, 0);
//	    calB.set(Calendar.SECOND, 0);
//	    calB.set(Calendar.MILLISECOND, 0);
		Calendar calB = new GregorianCalendar(); // Last sunday of month
		calB.set(Y, months.get(B) + 1, 1);
		calB.add(Calendar.DATE, -1);
		calB.add(Calendar.DAY_OF_MONTH, -(calB.get(Calendar.DAY_OF_WEEK) - 1));
	    calB.set(Calendar.HOUR_OF_DAY, 0);
	    calB.set(Calendar.MINUTE, 0);
	    calB.set(Calendar.SECOND, 0);
	    calB.set(Calendar.MILLISECOND, 0);
	    Date dateB = calB.getTime();
	    
	    System.out.println("DateB: " + dateB);
	    
	    Calendar cal = new GregorianCalendar();
	    cal.setTime(dateA);
	    int fullWeeks = 0;
	    while (cal.getTime().before(dateB)) {
	        // add one week
	        cal.add(Calendar.WEEK_OF_YEAR, 1);
	        fullWeeks++;
	    }
	    return fullWeeks;
	}
	
}
