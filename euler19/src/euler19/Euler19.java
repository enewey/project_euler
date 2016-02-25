package euler19;

public class Euler19 {

	//monday = 0, tues = 1, wed = 2, thurs = 3, fri = 4, sat = 5, sun = 6
	public static final int[] months = {31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if (year%4 == 0
				&& (!(year%100 == 0) || (year%400 == 0)) ) {
			return true;
		} 
		else 
			return false;
	}
	
	public int getDaysInYear(int year) {
		if (isLeapYear(year)) return 366;
		else return 365;
	}
	public int getFebruary(int year) {
		if (isLeapYear(year)) return 29;
		else return 28;
	}
	
	public int countSundaysOnFirst(int year, int startDay) {
		int tot = 0;
		for (int i=0, day = startDay; i<months.length; i++) { //iterate thru
			if (day == 6) {
				tot++;
			}
			day = (day + ((months[i] > 0) ? months[i] : getFebruary(year))) % 7;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		Euler19 e = new Euler19();
		int sundays = 0;
		int day = 1; //Jan 1 1901 is a tuesday
		for (int i=1901; i < 2001; i++) {
			sundays += e.countSundaysOnFirst(i, day); //find sundays on the 1st of month
			day = (day + e.getDaysInYear(i)) % 7; //get first day of the next year
		}
		System.out.println(sundays);
	}

}
