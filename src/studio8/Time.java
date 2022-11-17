package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean hourFormat;
	
	/**
	 * 
	 * @param hour = the hour in military time
	 * @param minute = the number of minutes
	 * @param hourFormat = whether the format is in 12-hour format
	 */
	public Time (int hour, int minute, boolean hourFormat) {	
		this.minute = minute;
		this.hourFormat = hourFormat;
		this.hour = hour;
	}
	
	/**
	 * returns the time as a string in either in 12 or 24 hour format
	 */
	public String toString() {
		if (this.hourFormat == true && this.hour>12) {
			return (this.hour - 12) + ":" + this.minute + "PM";
		}
		else if (this.hourFormat){
			return (this.hour) + ":" + this.minute + "AM";
		}
		else {
			return (this.hour) + ":" + this.minute;
		}
	}
	public static void main(String[] args) {
		Time time = new Time(13, 30, true);
		Time time1 = new Time(13, 30, true);
		System.out.println(time.toString());
		System.out.println(time1.equals(time));
		
		HashSet<Time> set = new HashSet<Time>();
		set.add(time1);
		set.add(time);
		set.add(time1);
		System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public boolean isHourFormat() {
		return hourFormat;
	}

	public void setHourFormat(boolean hourFormat) {
		this.hourFormat = hourFormat;
	}

}