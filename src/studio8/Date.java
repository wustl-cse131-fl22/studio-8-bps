package studio8;

import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * 
	 * @param month = the month
	 * @param day = the day
	 * @param year = the year
	 * @param isHoliday = whether the day is a holiday or not
	 */
	public Date (int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	/**
	 * returns a date with the string
	 */
	public String toString() {
		return this.month + "/" + this.day + "/" + this.day;
	}
    public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHoliday() {
		return isHoliday;
	}

	public void setHoliday(boolean isHoliday) {
		this.isHoliday = isHoliday;
	}

	public static void main(String[] args) {
		Date date = new Date(11, 17, 2022, false);
		System.out.println(date.toString());
		Date date2 = new Date(11, 17, 2022, true);
		System.out.println(date2.toString());
		Date date3 = new Date(11, 18, 2022, false);
		System.out.println(date3.toString());
		System.out.println(date2.equals(date));
		System.out.println(date2.equals(date3));
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
