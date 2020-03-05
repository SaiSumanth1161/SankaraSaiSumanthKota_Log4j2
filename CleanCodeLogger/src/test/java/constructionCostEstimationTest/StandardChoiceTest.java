package constructionCostEstimationTest;

import org.junit.Assert;
import org.junit.Test;
import constructionCostEstimationMain.*;
public class StandardChoiceTest {

	@Test
	public void test() {
		Assert.assertEquals(24000.000000,EstimatorMain.estimateCost("standard",20.0,false),0);
		Assert.assertEquals(30000.000000,EstimatorMain.estimateCost("standard",20.0,true),0);
		
		}

}
