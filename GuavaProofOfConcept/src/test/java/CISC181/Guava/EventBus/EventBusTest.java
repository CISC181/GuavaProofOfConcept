package CISC181.Guava.EventBus;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.EventListener;
import com.google.common.eventbus.EventBus;

public class EventBusTest implements EventListener {
	
	@Test
	public void ActionTest() {
		
		EventBus action = new EventBus();
		EventListener numberListener = new NumberListener();
		EventListener stringListener = new StringListener();
		action.register(numberListener);
		action.register(stringListener);
		action.post("Hi");
		
		//post to stringlistener check & not to numberListener
		assertEquals("Hi",((StringListener) stringListener).getiString());
		assertEquals(null, ((NumberListener) numberListener).getiInt());
		assertEquals(null, ((NumberListener) numberListener).getiDouble());
		assertEquals((Integer)1, ((NumberListener) numberListener).getDeadEvents());
		
		//post to Integer not Double 
		// stringlistener DeadEvents == 1
		action.post(5);
		assertEquals((Integer)5, ((NumberListener) numberListener).getiInt());
		assertEquals(null, ((NumberListener) numberListener).getiDouble());
		assertEquals((Integer)1, ((StringListener) stringListener).getDeadEevents());
		
		
		//post to Double not Integer
		action.post(4.4);
		assertEquals((Double)4.4, ((NumberListener) numberListener).getiDouble());
		assertEquals((Integer)5, ((NumberListener) numberListener).getiInt());

		
		//unregisters correct event should have value of last string post
		action.unregister(stringListener);
		action.post("blah");
		assertEquals("Hi",((StringListener) stringListener).getiString());
		
	
}
}
