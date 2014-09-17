package designConf.builder;

import designConf.interfaces.IConferenceBuilder;
import designConf.interfaces.IConstructConference;
import designConf.interfaces.IDPConference;
import designConf.util.Debug;

/**
 * @author PrajaktaMore and AnujSethi
 * DPConference class that sets values for conference
 */
public class DPConference implements IDPConference {

	private IConferenceBuilder conferenceBuilder;

	/**
	 * Constructor to set IConferenceBuilder's object
	 * @param inConferenceBuilder
	 */
	public DPConference(IConferenceBuilder inConferenceBuilder) {
		Debug.setDEBUG_VALUE(4, this.getClass().getName());
		this.conferenceBuilder = inConferenceBuilder;
	}

	/**
	 * Method that returns the object of type IConstructConference
	 * @return IConstructConference
	 */
	public IConstructConference getConstructConference() {
		return this.conferenceBuilder.constructConference();
	}
	
	/*
	 * Method to build Conference by enforcing series of steps:
	 * steps: setContestType, setPresentationType, setRestaurantType, setWayofTransport
	 * @see designConf.interfaces.IDPConference#constructConference()
	 */
	@Override
	public void constructConference() {
		Debug.setDEBUG_VALUE(3, this.getClass().getName());
		try {
			this.conferenceBuilder.setContestType();
			this.conferenceBuilder.setPresentationType();
			this.conferenceBuilder.setRestaurantType();
			this.conferenceBuilder.setWayofTransport();
		} catch (Exception e) {
			System.err.println("An error occoured while enforcing steps to construct Conference.");
			System.exit(0);
		}
	}
}
