package constructionCostEstimationMain;
import org.apache.logging.log4j.LogManager;
public class AboveStandardChoice {
	private static final org.apache.logging.log4j.Logger logger =LogManager.getLogger(EstimatorMain.class);

	public static double costPerSquare=1500;
	static double calculateCost(double Area,double extra) {
		logger.info("Method CalculateCost was called in AboveStandardChoice");
		costPerSquare+=extra;
		return (Area*costPerSquare);
	}
	static double calculateCost(double Area) {
		logger.info("Method CalculateCost was called in AboveStandardChoice");
		return (Area*costPerSquare);
	}
}
