package designConf.util;

/**
 * @author PrajaktaMore & AnujSethi
 * Debugger class that maintains logging information
 */
public class Debug {

	
	/**
	 * Constructor to set Debug value
	 */
	public Debug() {
		Debug.setDEBUG_VALUE(4, this.getClass().getName());
	}

	/**
	 * Integer Variable DEBUG_VALUE used for Logger
	 */
	private static int DEBUG_VALUE;	// accessor and mutator for DEBUG_VALUE

	/**
	 * @return the dEBUG_VALUE
	 */
	public static int getDEBUG_VALUE() {
		return DEBUG_VALUE;
	}
	/**
	 * @param dEBUG_VALUE the dEBUG_VALUE to set
	 */
	public static void setDEBUG_VALUE(int dEBUG_VALUE, String className) {
		try {
			DEBUG_VALUE = dEBUG_VALUE;
			if (DEBUG_VALUE == 4) {
				System.out.println(className + "Constructor is Called");
			} else if (DEBUG_VALUE == 3) {
				System.out.println(className + "Conference is Builded");
			} else if (DEBUG_VALUE == 2) {
				System.out.println("One of the type of Conference Factory is called");
			} else if (DEBUG_VALUE == 1) {
				System.out.println("\n-- Summary --");
				System.out.println("DP Conference created and below are details:");
			} else if (DEBUG_VALUE == 0) {
				System.out.println("No Output");
			}
		} catch (Exception e) {
			System.err.println("An error occoured while setting and/or printing Debug value.");
			System.exit(0);
		}
	}

}