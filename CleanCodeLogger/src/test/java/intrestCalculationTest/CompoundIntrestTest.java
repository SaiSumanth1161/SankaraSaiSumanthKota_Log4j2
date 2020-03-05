package intrestCalculationTest;

import org.junit.Assert;
import org.junit.Test;
import intrestcalculation.*;
public class CompoundIntrestTest {

	@Test
	public void test() {
		Assert.assertEquals(273.623914268861, CompundIntrest.compoundIntrestCalculation(20000, 8, .17, 12),0);

	}

}
