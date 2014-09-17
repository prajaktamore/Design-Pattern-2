package designConf.interfaces;

/**
 * @author PrajaktaMore and AnujSethi
 * IDPConferenceBuilder creates different scenarios to create Conference
 */
public interface IConferenceBuilder {
	
	/**
	 * Builder class setPresentationType method
	 */
	public void setPresentationType();
	
	/**
	 * Builder class setContestType method
	 */
	public void setContestType();
	
	/**
	 * Builder class setRestaurantType method
	 */
	public void setRestaurantType();
	
	/**
	 * Builder class setWayofTransport method
	 */
	public void setWayofTransport();
	
	/**
	 * @return IConstructConference
	 */
	public IConstructConference constructConference();
}
