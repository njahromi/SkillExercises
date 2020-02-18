/*
 * The DayCounter application takes in two arguments, a month &
 * a year, and displays the number of days in that month.
 */
public class DayCounter {
	
	public static void main (String[]args) {
		
		int yearIn = 2019;
		
		int monthIn = 10;
		
		if (args.length > 0)
			
			monthIn = Integer.parseInt(args[0]);
		
		if (args.length > 1)
			
			yearIn = Integer.parseInt(args[1]);
		
		System.out.println(monthIn + "/" + yearIn + " has " + countDays(monthIn, yearIn) + " days");
				
	}
	
	static int countDays(int month, int year) {
		
		int count = -1;
		
		switch (month) {
		
		case 1:
			
		case 3:
			
		case 5:
			
		case 7:
			
		case 8:
			
		case 10:
			
		case 12:
			
			count = 31;
			
			break;
		
		case 2:
			
			if ( year % 4 == 0)
				
				count = 20;
			
			else
				
				count = 28;
			
			if ((year % 100 == 0) & (year % 400 !=0))
				
				count = 28;
		}
		
		return count;
	}

}
