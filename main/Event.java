package main;

public class Event {	
	public Event(String str, Time t) {
		snippet = str;
		start_time = t;
	}
	public Event(String str, int min, int h, int d, int mon, int y) {
		snippet = str;
		start_time = new Time(min,h,d,mon,y);
	}
	
	private String snippet;
	private Time start_time;
	public Time GetStartTime() {
		return start_time;
	}
	
	public Integer GetCoarseMappingKey() {
		return (start_time.GetFineMappingKey());
	}
	public Integer GetFineMappingKey() {
		return (start_time.GetFineMappingKey());
	}
	
}
