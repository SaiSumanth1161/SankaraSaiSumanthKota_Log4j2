package intrestCalculationTest;

import org.junit.Assert;
import org.junit.Test;
import intrestcalculation.*;
public class SimpleIntrestTest {

	@Test
	public void test() {
		Assert.assertEquals(5400.000000000000, SimpleIntrest.simpleIntrestCalculation(20000, 3, 9.0),0);

	}

}
