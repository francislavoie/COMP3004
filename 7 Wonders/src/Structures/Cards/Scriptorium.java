package Structures.Cards;

import Resources.Resources;
import Structures.Structure;

public class Scriptorium extends Structure {

	public static final int ScriptoriumID = 0x61;
	
	public Scriptorium()
	{
		super(new Resources(0, 0, 0, 0, 0, 0, 1, 0), ScriptoriumID, "Scriptorium", GREEN_CARD, 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}