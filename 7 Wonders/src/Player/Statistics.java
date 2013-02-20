package Player;

import Resources.Resources;
import Tokens.*;

public class Statistics {

	private int VictoryPoints;
	private int Shields;
	private MilitaryVictoryTokens militaryVictoryPoints;
	private Resources resources;
	
	
	
	//Constructors
	public Statistics()
	{
		VictoryPoints = 0;
		Shields = 0;
		resources = new Resources();
		militaryVictoryPoints = new MilitaryVictoryTokens();
	}
	
	public Statistics(int coins, int clay, int ore, int stone, int wood, int glass, int loom, int papyrus)
	{
		VictoryPoints = 0;
		Shields = 0;
		resources = new Resources(ore, stone, wood, clay, glass, loom, papyrus, coins);
		militaryVictoryPoints = new MilitaryVictoryTokens();
	}
	
	public Statistics(int victoryPoints, int shields, int coins, int clay, 
			int ore, int stone, int wood, int glass, int loom, int papyrus)
	{
		VictoryPoints = victoryPoints;
		Shields = shields;
		resources = new Resources(ore, stone, wood, clay, glass, loom, papyrus, coins);
		militaryVictoryPoints = new MilitaryVictoryTokens();
	}
	
	
	
	
	//Getters
	public int GetVictoryPoints()
	{
		return VictoryPoints;
	}
	
	public int GetMilitaryStrength()
	{
		return Shields;
	}
	
	public Resources GetResources()
	{
		return resources;
	}
	
	public MilitaryVictoryTokens GetMilitaryVictoryTokens()
	{
		return militaryVictoryPoints;
	}
	
	
	//Setters
	public void SetVictoryPoints(int vPoints)
	{
		VictoryPoints = vPoints;
	}
	
	public void SetMilitaryStrength(int mStrength)
	{
		Shields = mStrength;
	}
	
		
	//Add functions
	public void AddVictoryPoints(int vPoints)
	{
		VictoryPoints += vPoints;
	}
	
	public void AddShields(int shields)
	{
		Shields += shields;
	}
	
	public void AddStats(Statistics stats)
	{
		VictoryPoints    += stats.GetVictoryPoints();
		Shields          += stats.GetMilitaryStrength();
		resources.AddResources(stats.GetResources());
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Statistics");
	}

}
