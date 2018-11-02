package CISC181.Guava.EvictingQueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvictingQueue_Test {

	@Test
	public void EV_Tes1() {
		
		GuavaQueueEvicting gEQ = new GuavaQueueEvicting(5);
		int iExpectedSize = 5;
		int iCount = 0;
		int iExpectedCount = 9;
		
		for (int iSize = 1; iSize < 10; iSize++)
		{
			iCount++;
			gEQ.AddItem(new Rectangle(iSize, iSize));
			
		}		
		assertEquals(iExpectedSize, gEQ.Size());
		assertEquals(iExpectedCount, iCount);
		
		Rectangle rec = gEQ.GetItem();
		
		
		System.out.println(rec.getiLength());
		
	}

}
