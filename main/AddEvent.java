package main;
import java.util.*;

public class AddEvent {
	private Calendar calendar;
	public AddEvent() {
		calendar = new Calendar();
	}
	public Event TestAddEvent(Event e) {
		//System.out.println("About to attempt AddEvent()");
		if(calendar.AddEvent(e)) {
			//System.out.println("Event added. Looking for and returning event");
			return calendar.GetEvent(e.GetStartTime());
		}
		return null;
	}
}
