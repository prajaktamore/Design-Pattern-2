package designConf.driver;

import designConf.builder.ConferenceBuilder;
import designConf.builder.DPConference;
import designConf.interfaces.IConferenceBuilder;
import designConf.interfaces.IDPConference;
import designConf.interfaces.IResults;
import designConf.pojo.DPConferencePOJO;
import designConf.util.Results;

/**
 * @author PrajaktaMore and AnujSethi
 * Driver class that calls all functionalities implemented
 */
public class Driver {
	public static void main(String[] args) {
		
		try {
			if(!(args.length>0)){
				IConferenceBuilder conferenceBuilder = new ConferenceBuilder();
				IDPConference dpConference = new DPConference(conferenceBuilder);
				DPConferencePOJO.setContestType("Lab1");				//Lab Preference [Lab1/Lab2/Lab3]
				DPConferencePOJO.setWay("Walk");						//Mode of transport Preference [Campus Bus/Elevators_Tunnels]
				DPConferencePOJO.setPresentationType("Creational");		//Presentation Preference [Structural/Behavioral/Creational]
				DPConferencePOJO.setRestaurantType("PS");				//Restaurant Preference [PS/Number 5/Lemongrass]
				DPConferencePOJO.setUCC(Boolean.TRUE);					//Credit Card type BU Platinum Alumni- TRUE/FALSE
				dpConference.constructConference();
				IResults results = new Results();
				results.display();
			}
			else {
				System.out.println("No Arguements required!");
				System.exit(0);
			}
		} catch (Exception e) {			
			System.err.println("An error occoured while starting the program. Issue in driver file.");
			System.exit(0);
		}
	}
}
