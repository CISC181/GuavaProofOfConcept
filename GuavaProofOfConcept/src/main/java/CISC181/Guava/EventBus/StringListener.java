package  CISC181.Guava.EventBus;

import java.util.EventListener;
import com.google.common.eventbus.Subscribe;

public class StringListener implements EventListener {
		
		private String iString;
		private Integer DeadEvents = 0;
		private Integer count = 0;
		
		@Subscribe
		public void IntEvent(Object o) {
			if(o instanceof String) {
			this.iString = (String) o;
			count++;
			}
			else {
				DeadEvents ++;
			}
		}
		
		public String getiString() {
			return iString;
		}
		
		public Integer getCount(){
			return count;
		}
		
		public Integer getDeadEevents() {
			return DeadEvents;
		}
		
		

}
