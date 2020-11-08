package main;
import java.util.*;

public class Calendar {
	private ArrayList<Day> calendar;
	public Calendar() {
		calendar = new ArrayList<Day>();
	}
	public boolean AddEvent(Event e) {
		calendar.add(new Day(e.GetCoarseMappingKey()));
		return calendar.get(0).AddEvent(e);
	}
	
	public Event GetEvent(Time t) {
		//int coarseTime = t.GetCoarseMappingKey();
		//System.out.println("Calendar size = "+calendar.size());
		for(int i=0; i<calendar.size(); ++i) {
			Event e = calendar.get(i).GetEvent(t);
			//System.out.println("Event time: "+e.GetStartTime().toString());
			if(e != null) {
				return e;
			}
		}
		return null;
	}
	
	public ArrayList<Event> GetAllEventsOfMonth(Time t){
		ArrayList<Event> allEventsOfMonth = new ArrayList<Event>();
		for(int i=0; i<calendar.size(); ++i) {
				if((calendar.get(i).GetCoarseTime()/100) == t.GetMonth()) {
					allEventsOfMonth.addAll(calendar.get(i).GetAllEvents());
				}
		}
		return allEventsOfMonth;
	}
}
