package lpapps.ers.objects;
/**
 * 
 * @author Laurence Parker
 * Date object class
 *
 */
public class Date {

	private int day, month, year;
	
	/**
	 * Null constructor
	 */
	public Date() {
		day = month = year = 0;
	}
	
	/**
	 * Defined constructor
	 * @param dd the day
	 * @param mm the month
	 * @param yyyy the year
	 */
	public Date(int dd, int mm, int yyyy) {
		day = dd;
		month = mm;
		year = yyyy;
	}
	
	/**
	 * Clone constructor
	 * @param otherDate Date to clone
	 */
	public Date(Date otherDate) {
		day = otherDate.day;
		month = otherDate.month;
		year = otherDate.year;
	}

	/**
	 * @param otherDate the date to copy
	 */
	public void copyDate(Date otherDate) {
		day = otherDate.day;
		month = otherDate.month;
		year = otherDate.year;
	}
	
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return "dd:" + String.valueOf(day) + " mm:" + String.valueOf(month)
				+ " yyyy:" + String.valueOf(year);
	}
	
	/**
	 * Compare chronological order of two Dates 
	 * @param otherDate the comparison date
	 * @return boolean true if current Date is older
	 */
	public boolean olderThan(Date otherDate) {
		if (year < otherDate.year) {
			return true; }
		else if (year == otherDate.year && month < otherDate.month) {
			return true; }
		else if (year == otherDate.year && month == otherDate.month &&
				day < otherDate.day) {
			return true; }
		else
			return false;
	}
	
	/**
	 * Compare if two Dates are the same
	 * @param otherDate the comparison Date
	 * @return boolean true if the dates are the same
	 */
	public boolean equals (Date otherDate) {
		return year == otherDate.year && month == otherDate.month &&
				day == otherDate.day;
	}
	
	/**
	 * Display integer month as a 3-letter string 
	 * @return String The month as a 3-letter string
	 */
	public String monthAsString() {
		if (month == 1) {
			return "Jan";
		} else if (month == 2) {
			return "Feb";
		} else if (month == 3) {
			return "Mar";
		} else if (month == 4) {
			return "Apr";
		} else if (month == 5) {
			return "May";
		} else if (month == 6) {
			return "Jun";
		} else if (month == 7) {
			return "Jul";
		} else if (month == 8) {
			return "Aug";
		} else if (month == 9) {
			return "Sep";
		} else if (month == 10) {
			return "Oct";
		} else if (month == 11) {
			return "Nov";
		} else if (month == 12) {
			return "Dec";
		} else 
			return "Month is invalid";
	}
}
