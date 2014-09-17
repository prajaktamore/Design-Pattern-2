package designConf.builder;

import designConf.interfaces.IConferenceBuilder;
import designConf.interfaces.IConstructConference;
import designConf.pojo.DPConferencePOJO;
import designConf.util.Debug;

/**
 * @author PrajaktaMore and AnujSethi
 * DPConferenceBuilder class builds the conference according to type
 */
public class ConferenceBuilder implements IConferenceBuilder {
	private IConstructConference objConstructConference = new ConstructConference();

	/**
	 * ConstrcutorBuilder is the constructor
	 */
	public ConferenceBuilder() {
		Debug.setDEBUG_VALUE(4, this.getClass().getName());
	}

	/* Call ConstructConference's method to set Presentation type
	 * @see designConf.interfaces.IConferenceBuilder#setPresentationType()
	 */
	@Override
	public void setPresentationType() {
		objConstructConference.setPresentationType(DPConferencePOJO.getPresentationType());
	}
	
	/* Call ConstructConference's method to set Lab type
	 * @see designConf.interfaces.IConferenceBuilder#setContestType()
	 */
	@Override
	public void setContestType() {
		objConstructConference.setContestType(DPConferencePOJO.getContestType());
	}

	/* Call ConstructConference's method to set Restaurant type
	 * @see designConf.interfaces.IConferenceBuilder#setRestaurantType()
	 */
	@Override
	public void setRestaurantType() {
		objConstructConference.setRestaurantType(DPConferencePOJO.getRestaurantType());
	}

	/* return the object of type IConstructConference
	 * @see designConf.interfaces.IConferenceBuilder#constructConference()
	 */
	@Override
	public IConstructConference constructConference() {
		return this.objConstructConference;
	}

	/* Call ConstructConference's method to set Transportation type
	 * @see designConf.interfaces.IConferenceBuilder#setWayofTransport()
	 */
	@Override
	public void setWayofTransport() {
		objConstructConference.setWayofTransport(DPConferencePOJO.getWay());
	}
}
