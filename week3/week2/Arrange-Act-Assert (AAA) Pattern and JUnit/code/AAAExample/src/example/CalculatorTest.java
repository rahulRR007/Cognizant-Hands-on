package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
 
	private Calculator cal;
	
	@Before
	public void setup()
	{
		cal = new Calculator();
		System.out.println("Setup: new calculator is created");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Teardown: Test complete");
	}
	
	@Test
	public void Testaddi()
	{
		int result = cal.add(4, 5);
		assertEquals(9, result);
		
	}
	@Test
    public void testmulti() {

        int result = cal.multiply(4, 6);


        assertEquals(24, result);
    }
}