package CISC181.Guava.EvictingQueue;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Queues;

import java.util.ArrayList;
import java.util.Queue;

public class GuavaQueueEvicting {

	private Queue<Rectangle> evictingQueue;

	public GuavaQueueEvicting(int iSize) {
		evictingQueue = EvictingQueue.create(iSize);
	}

	public void AddItem(Rectangle rec) {
		evictingQueue.add(rec);
	}

	public void RemoveItem(Rectangle rec) {
		evictingQueue.remove(rec);
	}
	
	public Rectangle GetItem()
	{
		return evictingQueue.remove();
		
	}

	public int Size() {
		return evictingQueue.size();
	}

	public boolean isEmpty() {
		return evictingQueue.isEmpty();
	}

	public ArrayList<Rectangle> ShowItems() {
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		for (Rectangle rec : evictingQueue) {
			System.out.println("Area: " + rec.area());
			recs.add(rec);

		}
		return recs;
	}

	public void poll() {
		System.out.println("Poll Queue Evicting");
		while (!evictingQueue.isEmpty()) {
			System.out.println(evictingQueue.poll().area());
		}
	}
}
