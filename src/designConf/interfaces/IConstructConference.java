package designConf.interfaces;

/**
 * @author PrajaktaMore and Anuj Sethi
 * Interface to Construct a conference for each user 
 */

/**
 * @author Anuj Sethi
 *
 */
public interface IConstructConference {
	
	/**
	 * To set presentation type
	 * @param inpresentation
	 */
	public void setPresentationType(String inpresentation);
	

	/**
	 * To set Lab type
	 * @param incontest
	 */
	public void setContestType(String incontest);

	/**
	 * To set Restaurant type
	 * @param inrestaurant
	 */
	public void setRestaurantType(String inrestaurant);

	/**
	 * To set transport type
	 * @param wayofTransport
	 */
	public void setWayofTransport(String wayofTransport);
}
