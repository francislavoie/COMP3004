package Structures;

import Resources.Resources;

public class LumberYard extends Structure {

	public static final int LumberYardID = 0x37;
	
	public LumberYard()
	{
		super(new Resources(0, 0, 0, 0, 0, 0, 0, 0), LumberYardID, "Lumber Yard", BROWN_CARD, 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}