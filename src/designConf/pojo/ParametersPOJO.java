package designConf.pojo;

import designConf.util.Debug;

/**
 * @author PrajaktaMore and AnujSethi
 * ParammeterPOJO is a POJO(plain old java objects) that stores the parameters like time,cost and co2
 * 
 */
public class ParametersPOJO {

	private static float totalTime;
	private static float totalcost;
	private static float totalCO2;

	public ParametersPOJO() {
		Debug.setDEBUG_VALUE(4, this.getClass().getName());
	}
	/**
	 * @param time
	 * the time to set
	 */
	public void setTime(float time) {
		System.out.println("Time Required: " + time + " Minutes");
		totalTime = time + totalTime;
	}

	/**
	 * @param cost
	 * the cost to set
	 */
	public void setCost(float cost) {
		System.out.println("Cost Required: $" + cost);
		totalcost = totalcost + cost;
	}

	/**
	 * @param cO2
	 * the cO2 to set
	 */
	public void setCO2(float cO2) {
		System.out.println("Carbon Footprint is: " + cO2);
		totalCO2 = totalCO2 + cO2;
	}

	/**
	 * @return the totalTime
	 */
	public static float getTotalTime() {
		return totalTime;
	}

	/**
	 * @return the totalcost
	 */
	public static float getTotalcost() {
		return totalcost;
	}

	/**
	 * @return the totalCO2
	 */
	public static float getTotalCO2() {
		return totalCO2;
	}

}
