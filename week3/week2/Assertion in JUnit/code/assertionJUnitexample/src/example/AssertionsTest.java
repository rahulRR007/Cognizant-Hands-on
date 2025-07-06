package example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionsTest {

	@Test
	public void testAssertions()
	{
		assertEquals(5,2+3);
		
		assertTrue(5>3);
		
		assertFalse(6>9);
		
		Object obj = null;
		assertNull(obj);
		
		
		Object Nonnullobj = new Object();
		assertNotNull(Nonnullobj);
	}
}