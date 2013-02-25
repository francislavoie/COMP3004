
package Structures.Cards;

import Resources.Resources;
import Structures.Structure;
import WonderBoards.WonderBoard;

public class Haven extends Structure {

	public static final int HavenID = 0x59;
	
	public Haven()
	{
		super(new Resources(1, 0, 1, 0, 0, 1, 0, 0), HavenID, "Haven", YELLOW_CARD, 3);
	}
	
	public boolean canBuildForFree(WonderBoard wb)
	{
		return wb.containsCard(Forum.ForumID);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
