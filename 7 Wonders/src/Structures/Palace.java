package Structures;

import Resources.Resources;

public class Palace extends Structure {

	public static final int PalaceID = 0x2A;
	
	public Palace()
	{
		super(new Resources(1, 1, 1, 1, 1, 1, 1, 0), PalaceID, "Palace", BLUE_CARD, 3);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}