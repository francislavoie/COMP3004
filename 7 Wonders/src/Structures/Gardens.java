package Structures;

import Resources.Resources;

public class Gardens extends Structure {

	public static final int GardensID = 0x2C;
	
	public Gardens()
	{
		super(new Resources(0, 0, 1, 2, 0, 0, 0, 0), GardensID, "Gardens", BLUE_CARD, 3);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}