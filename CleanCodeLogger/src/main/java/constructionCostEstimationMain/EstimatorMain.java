package constructionCostEstimationMain;
import org.apache.logging.log4j.LogManager;

public class EstimatorMain {

	private static final org.apache.logging.log4j.Logger logger =LogManager.getLogger(EstimatorMain.class);
	public static double estimateCost(String option,double totalArea, boolean automated) {
		double totalCost=0;
		if(option=="standard") {
			if(automated==true) {
				logger.info("User opted for Standard-Automation option");
				logger.error("Standard-Automation option is not available. So we are taking other values for calculation");
				
				totalCost=StandardChoice.calculateCost(totalArea,300.0);
			}
			else {
				logger.info("User opted for Standard option");
				totalCost=StandardChoice.calculateCost(totalArea);
			}
		}
		else if(option=="abovestandard") {
			if(automated==true) {
				logger.info("User opted for Above Standard-Automation option");
				logger.error("Standard-Automation option is not available. So we are taking other values for calculation");
				totalCost=AboveStandardChoice.calculateCost(totalArea,500.0);
			}
			else {
				logger.info("User opted for Above Standard option");
				totalCost=AboveStandardChoice.calculateCost(totalArea);
			}
		}
		else {
			if(automated==true) {
				logger.info("User opted for High Standard-Automation option");
				totalCost=HighStandardChoice.calculateCost(totalArea,700.0);
			}
			else {
				logger.info("User opted for High Standard option");
				totalCost=HighStandardChoice.calculateCost(totalArea);
			}
		}
		return totalCost;
	}
}
