package designConf.builder;

import designConf.interfaces.IConstructConference;
import designConf.pojo.DPConferencePOJO;
import designConf.pojo.ParametersPOJO;
import designConf.util.Debug;

/**
 * @author PrajaktaMore and AnujSethi
 * class to Construct a conference for each user
 */

public class ConstructConference implements IConstructConference {
	ParametersPOJO parametersPOJO = new ParametersPOJO();

	private String presentation;
	private String labType;
	private String restaurant;

	public ConstructConference() {
		Debug.setDEBUG_VALUE(4, this.getClass().getName());
	}

	/* Method to make presentation choice
	 * Accepts presentation name as string input 
	 * @see designConf.interfaces.IDPConference#setPresentationType(java.lang.String)
	 */
	@Override
	public void setPresentationType(String inpresentation) {
		try {
			presentation = inpresentation;
			System.out.println("\n-- Presentation session --");
			System.out.println("You have selected presentation type: " + presentation);
			
			if (presentation.equalsIgnoreCase("Structural")) {
				parametersPOJO.setCO2(12);
			} else if (presentation.equalsIgnoreCase("Behavioral")) {
				parametersPOJO.setCO2(9);
			} else if (presentation.equalsIgnoreCase("Creational")) {
				parametersPOJO.setCO2(6);
			}
		} catch (Exception e) {
			System.err.println("An error occoured while making presentation choice.");
			System.exit(0);
		}
	}

	/* Method to make Lab choice
	 * Accepts Lab name as string input 
	 * @see designConf.interfaces.IDPConference#setContestType(java.lang.String)
	 */
	@Override
	public void setContestType(String inLabType) {
		try {
			labType = inLabType;
			int regCost = 100;	//Registration Cost
			System.out.println("\n-- Registration Fee --");
			
			//Calculate registraion fee
			if (DPConferencePOJO.getUCC()) {			
				System.out.println("Credit card type is BU Alumni platinum -- 10% Discount applicable");
				parametersPOJO.setCost(regCost - (regCost / 10));
			} else {
				System.out.println("Credit card type is not BU Alumni platinum -- NO Discount applicable");
				parametersPOJO.setCost(regCost);
			}
					
			System.out.println("\n-- Programming contest Lab choice --");
			System.out.println("You have selected to work in \"" + labType + "\" for the programming contest.");
			
			//Calculate Time & Carbon Footprint based on Lab Choice
			if (labType.equalsIgnoreCase("Lab1")) {
				parametersPOJO.setTime(30);
				parametersPOJO.setCO2(10);
			} else if (labType.equalsIgnoreCase("Lab2")) {
				parametersPOJO.setTime(20);
				parametersPOJO.setCO2(20);
			} else if (labType.equalsIgnoreCase("Lab3")) {
				parametersPOJO.setTime(10);
				parametersPOJO.setCO2(30);
			}
		} catch (Exception e) {
			System.err.println("An error occoured while making Lab choice.");
			System.exit(0);
		}

	}


	/* Method to set Restaurant choice
	 * Accepts Restaurant name as string input 
	 * @see designConf.interfaces.IConstructConference#setRestaurantType(java.lang.String)
	 */
	@Override
	public void setRestaurantType(String inrestaurant) {
		try {
			restaurant = inrestaurant;
			System.out.println("\n-- Working-Dinner --");
			System.out.println("You have selected restuarant type: " + restaurant);
			Debug.setDEBUG_VALUE(2, this.getClass().getName());
			if (restaurant.equalsIgnoreCase("PS")) {
				parametersPOJO.setTime(60);
				parametersPOJO.setCost(50);
				parametersPOJO.setCO2(12);
			} else if (restaurant.equalsIgnoreCase("Number 5")) {

				parametersPOJO.setTime(55);
				parametersPOJO.setCost(40);
				parametersPOJO.setCO2(9);

			} else if (restaurant.equalsIgnoreCase("Lemongrass")) {

				parametersPOJO.setTime(65);
				parametersPOJO.setCost(35);
				parametersPOJO.setCO2(6);

			}
		} catch (Exception e) {
			System.err.println("An error occoured while making Restaurant choice.");
			System.exit(0);
		}
	}


	/* Method to set mode of transport
	 * Accepts mode of transport name as string input 
	 * @see designConf.interfaces.IConstructConference#setWayofTransport(java.lang.String)
	 */
	@Override
	public void setWayofTransport(String wayofTransport) {
		try {
			Debug.setDEBUG_VALUE(2, this.getClass().getName());
			System.out.println("\n-- Mode of Transport --");
			if (wayofTransport.equalsIgnoreCase("Campus Bus")) {
				System.out.println("Mode of transport selected: Campus Bus");
				parametersPOJO.setTime(30);
				parametersPOJO.setCO2(40);
			} else if (wayofTransport.equalsIgnoreCase("Elevators_Tunnels")) {

				System.out.println("Mode of transport selected: Elevators & Tunnels");
				parametersPOJO.setTime(50);
				parametersPOJO.setCO2(9);
			}
			else if (wayofTransport.equalsIgnoreCase("Walk")) {
				System.out.println("Mode of transport selected: Walk");
				parametersPOJO.setTime(90);
				parametersPOJO.setCO2(6);
			}
		} catch (Exception e) {
			System.err.println("An error occoured while making Transportation choice.");
			System.exit(0);
		}
	}

}
