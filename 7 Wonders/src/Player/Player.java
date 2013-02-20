package Player;

import WonderBoards.WonderBoard;
import Structures.Structure;
import java.util.ArrayList;

public class Player {

	private Statistics stats, toAdd;
	private String username;
	private int ID;
	private WonderBoard wonderBoard;
	private ArrayList<Structure> cards;
	
	//constructors
	public Player()
	{
		username = "noob";
		ID = 0;
		stats = new Statistics();
		toAdd = new Statistics();
		wonderBoard = new WonderBoard();
		cards = new ArrayList<Structure>();
	}
	
	public Player(String uname, int id)
	{
		username = uname;
		ID = id;
		stats = new Statistics();
		toAdd = new Statistics();
		wonderBoard = new WonderBoard();
		cards = new ArrayList<Structure>();
	}
	
	//getters
	public Statistics GetStats()
	{
		return stats;
	}
	
	public String GetUsername()
	{
		return username;
	}
	
	public int GetID()
	{
		return ID;
	}
	
	public ArrayList<Structure> GetCards()
	{
		return cards;
	}
	
	public WonderBoard GetWonderBoard()
	{
		return wonderBoard;
	}
	
	
	//setters
	public void AssignWonderBoard(WonderBoard wb)
	{
		wonderBoard = wb;
	}
		
	
	//actions
	public void AddStats(Statistics stats)
	{
		toAdd.AddStats(stats);
	}
	
	public void AssignCard(Structure s)
	{
		if ( cards.size() < 7 ) cards.add(s);
	}
	
	public void AssignCards(ArrayList<Structure> newCards)
	{
		cards = newCards;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
