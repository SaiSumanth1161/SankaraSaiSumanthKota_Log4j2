package intrestcalculation;

import org.apache.logging.log4j.LogManager;

public class CompundIntrest {
	private static final org.apache.logging.log4j.Logger logger =LogManager.getLogger(CompundIntrest.class);

	public static double compoundIntrestCalculation(double principleAmount,double timeTaken,double ratePerYear, int compoundedAt) {
		double po=Math.pow(1+(ratePerYear/100), timeTaken);
		logger.info("compound Intrest calculated");
	    return (principleAmount * po)-principleAmount;
	}
}
