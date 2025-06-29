package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
@Test
public void testAdd() {
	Calculator Cal = new Calculator();
	int result = Cal.add(3,5);
	assertEquals(8, result);
	
}

   
}