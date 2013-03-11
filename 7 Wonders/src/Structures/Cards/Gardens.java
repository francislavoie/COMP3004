package Structures.Cards;

import Structures.Structure;
import Tokens.Resources;
import WonderBoards.WonderBoard;

public class Gardens extends Structure {

	public static final int GardensID = 36;
	
	public Gardens()
	{
		super(new Resources(0, 0, 1, 2, 0, 0, 0, 0), GardensID, "Gardens", BLUE_CARD, 3);
	}
	
	public boolean canBuildForFree(WonderBoard wb)
	{
		return wb.containsCard(Statue.StatueID);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}