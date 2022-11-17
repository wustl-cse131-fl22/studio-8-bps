package studio8;

import java.util.LinkedList;

public class Calender {
	private LinkedList<Appointment> calender;
	public Calender (LinkedList<Appointment> calender) {
		this.calender = calender;
	}
	public LinkedList<Appointment> getCalender() {
		return calender;
	}
	public void setCalender(LinkedList<Appointment> calender) {
		this.calender = calender;
	}
	
	public void addAppointment(Appointment a) {
		calender.add(a);
	}
}
