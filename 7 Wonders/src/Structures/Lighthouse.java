package Structures;

import Resources.Resources;

public class Lighthouse extends Structure {

	public static final int LighthouseID = 0x5B;
	
	public Lighthouse()
	{
		super(new Resources(0, 1, 0, 0, 1, 0, 0, 0), LighthouseID, "Lighthouse", YELLOW_CARD, 3);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}