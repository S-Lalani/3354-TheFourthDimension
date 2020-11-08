package main;

public class Time {
	private int minute;
	private int hour;
	private int day;
	private int month;
	private int year;
	
	public String toString() {
		return("min:"+minute+" hour:"+hour+" day:"+day+" month"+month+" year:"+year);
	}
	public Integer GetCoarseMappingKey() {
		return (day + 100*month + 10000*year);
	}
	public Integer GetFineMappingKey() {
		return (minute + 100*hour);
	}
	public Time(int min, int h, int d, int mon, int y) {
		minute = min;
		hour = h;
		day = d;
		month = mon;
		year = y;
	}
	public int GetMinute() {
		return minute;
	}
	public void SetMinute(int min) {
		minute = min;
	}
	public int GetHour() {
		return hour;
	}
	public void SetHour(int h) {
		hour = h;
	}
	public int GetDay() {
		return day;
	}
	public void SetDay(int d) {
		day = d;
	}
	public void IncrementDay() {
		day += 1;
	}
	public int GetMonth() {
		return month;
	}
	public void SetMonth(int mon) {
		month = mon;
	}
	public int GetYear() {
		return year;
	}
	public void SetYear(int y) {
		year = y;
	}
}
