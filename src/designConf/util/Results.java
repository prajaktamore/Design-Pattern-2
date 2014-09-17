package designConf.util;

import designConf.interfaces.IResults;
import designConf.pojo.ParametersPOJO;

/**
 * @author PrajaktaMore and AnujSethi
 * Result class stores matched values and acts as Input source for output to be displayed
 */

public class Results implements IResults {

	/**
	 * Constructor of result
	 */
	public Results() {
		Debug.setDEBUG_VALUE(4, this.getClass().getName());
	}
	
	/* Display method to display final summary
	 * @see designConf.interfaces.IResults#display(designConf.interfaces.IDPConference)
	 */
	@Override
	public void display() {
		Debug.setDEBUG_VALUE(1, this.getClass().getName());

		try {
			System.out.println("Total Carbon Footprint: " + ParametersPOJO.getTotalCO2());
			System.out.println("Total Cost: $" + (ParametersPOJO.getTotalcost()));
			System.out.println("Total time: " + ParametersPOJO.getTotalTime() + " Minutes");
		} catch (Exception e) {
			System.err.println("An error occoured while printing the summary.");
			System.exit(0);
		}
	}

}
