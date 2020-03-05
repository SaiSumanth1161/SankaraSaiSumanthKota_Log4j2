package constructionCostEstimationMain;
import org.apache.logging.log4j.LogManager;

public class HighStandardChoice {
	private static final org.apache.logging.log4j.Logger logger =LogManager.getLogger(EstimatorMain.class);

	public static double costPerSquare=1800;
	static double calculateCost(double Area,double extra) {
		logger.info("Method CalculateCost was called in HighStandardChoice");

		costPerSquare+=extra;
		return (Area*costPerSquare);
	}
	static double calculateCost(double Area) {
		logger.info("Method CalculateCost was called in HighStandardChoice");

		return (Area*costPerSquare);
	}
}
