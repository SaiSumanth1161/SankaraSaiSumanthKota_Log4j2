package intrestcalculation;

import org.apache.logging.log4j.LogManager;


public class SimpleIntrest {
	private static final org.apache.logging.log4j.Logger logger =LogManager.getLogger(SimpleIntrest.class);

	public static double simpleIntrestCalculation(double principleAmount,double timeTaken,double ratePerYear) {
		logger.info("Simple Interest Calculated");
		return (principleAmount*timeTaken*ratePerYear)/100;
	}
}
