package main;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddEventTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before Test Case");
	}
	
	@Test
	public void isGreaterTest() throws Exception{	
		System.out.println("Test");
		Time time = new Time(0,11,8,11,20);
		Time sameDayTime = new Time(59,11,8,11,20);
		Time newDayTime = new Time(59,11,9,11,20);
		
		Event newEvent1 = new Event("Test Event", time);
		Event newEvent2 = new Event("Test Event", sameDayTime);
		Event newEvent3 = new Event("Test Event", newDayTime);
		
		AddEvent addEvent = new AddEvent();
		
		Event e1 = addEvent.TestAddEvent(newEvent1);
		assertEquals("Added one. Testing", time, e1.GetStartTime());
		
		Event e2 = addEvent.TestAddEvent(newEvent2);
		assertEquals("Added another. Testing", sameDayTime, e2.GetStartTime());
		
		assertEquals("Looking for first again", time, e1.GetStartTime());
		
		Event e3 = addEvent.TestAddEvent(newEvent3);
		assertEquals("Testing another day", newDayTime, e3.GetStartTime());
		
		assertEquals("Looking for first again", time, e1.GetStartTime());
		assertEquals("Looking for second again", sameDayTime, e2.GetStartTime());
	}
	
	@After
	public void after() {
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
