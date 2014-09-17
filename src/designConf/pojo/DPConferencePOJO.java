package designConf.pojo;

import designConf.util.Debug;

/**
 * @author PrajaktaMore and AnujSethi
 * DPCOnferencePOJO is a POJO that have simple plain old java objects required in code
 */
public class DPConferencePOJO {
	static String PresentationType;
	static String ContestType;
	static String RestaurantType;
	static String way;
	static Boolean UCC;
	public DPConferencePOJO() {
		Debug.setDEBUG_VALUE(4, this.getClass().getName());
	}

	/**
	 * @return the presentationType
	 */
	public static String getPresentationType() {
		return PresentationType;
	}

	/**
	 * @param presentationType
	 * the presentationType to set
	 */
	public static void setPresentationType(String presentationType) {
		PresentationType = presentationType;
	}

	/**
	 * @return the contestType
	 */
	public static String getContestType() {
		return ContestType;
	}

	/**
	 * @param contestType
	 * the contestType to set
	 */
	public static void setContestType(String contestType) {
		ContestType = contestType;

	}

	/**
	 * @return the restaurantType
	 */
	public static String getRestaurantType() {
		return RestaurantType;
	}

	/**
	 * @param restaurantType
	 * the restaurantType to set
	 */
	public static void setRestaurantType(String restaurantType) {
		RestaurantType = restaurantType;
	}

	/**
	 * @return the way
	 */
	public static String getWay() {
		return way;
	}

	/**
	 * @param way
	 * the way(mode of transport) to set
	 */
	public static void setWay(String way) {
		DPConferencePOJO.way = way;
	}

	/**
	 * @return the uCC (BU Alumni platinum credit card)
	 */
	public static Boolean getUCC() {
		return UCC;
	}
	/**
	 * @param uCC
	 * the uCC to set (BU Alumni platinum credit card)
	 */
	public static void setUCC(Boolean uCC) {
		UCC = uCC;
	}

}
