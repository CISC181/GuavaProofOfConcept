package CISC181.Guava.EventBus;


/* can have more than one subscriber in a class 
eventbus will post to correct event */


import java.util.EventListener;
import com.google.common.eventbus.Subscribe;

public class NumberListener implements EventListener {
		
		private Integer iInt;
		private Double iDouble;
		private Integer DeadEvents = 0;
		private Integer count = 0;
		
		@Subscribe
		public void IntEvent(Object o) {
			if(o instanceof Integer) {
			this.iInt = (Integer) o;
			count++;
			}
			else {
				DeadEvents ++;
			}
		}
		
		@Subscribe
		public void DoubleEvent(Object o) {
			if(o instanceof Double) {
				this.iDouble = (Double) o;
				count++;
			}
		}
		
		

		public Integer getiInt() {
			return iInt;
		}

		public Double getiDouble() {
			return iDouble;
		}

		public Integer getDeadEvents() {
			return DeadEvents;
		}

		public Integer getCount() {
			return count;
		}
		
		

		
}
