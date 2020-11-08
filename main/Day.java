package main;
import java.util.*;

public class Day {
	private int coarseTime;
	private ArrayList<Event> events;
	
	public Day(int i) {
		events = new ArrayList<Event>();
		coarseTime = i;
	}
	
	public int GetCoarseTime() {
		return coarseTime;
	}
	
	public boolean AddEvent(Event e) {
		return events.add(e);
	}
	
	public Event GetEvent(Time t) {
		for(int i=0; i<events.size(); ++i) {
			if(events.get(i).GetStartTime() == t) {
				return events.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Event> GetAllEvents(){
		ArrayList<Event> eventList = new ArrayList<Event>();
		eventList.addAll(events);
		return eventList;
	}
}
