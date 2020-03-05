package constructionCostEstimationTest;

import org.junit.Assert;
import org.junit.Test;
import constructionCostEstimationMain.*;
public class HighStandardChoiceTest {

	@Test
	public void test() {
		Assert.assertEquals(36000.0,EstimatorMain.estimateCost("highstandard",20.0,false),0);
		Assert.assertEquals(50000.0,EstimatorMain.estimateCost("highstandard",20.0,true),0);

		}

}
