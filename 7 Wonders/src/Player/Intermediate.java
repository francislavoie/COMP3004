package Player;

import java.util.ArrayList;
import java.util.Collections;

import Structures.Structure;


public class Intermediate implements Strategy{
	
	/*
	Follows a dynamic strategy that involves calculating neighbors victory points to determine the optimal choice of cards to 
	gain victory points and deny the neighbor from gaining maximum points.
	*/
	public void strategicPick(AIPlayer p, ArrayList<Structure> discarded, Player leftNeighbor, Player rightNeighbor)
	{
		boolean did = false;
		float aiCoef = (float) p.calculateVictoryPoints();
		float neighCoef = (float) p.getNextPlayer(leftNeighbor, rightNeighbor).calculateVictoryPoints();
		float choiceCoef = aiCoef / neighCoef;
		
		ArrayList<Integer> selectionNumbers = p.cardSelectionNumbers(leftNeighbor, rightNeighbor, choiceCoef);
		
		for ( int index = 0; index < p.cards.size(); ++index )
		{
			if (Collections.max(selectionNumbers) == 0)
				break;
			int result;
			p.chooseCard(selectionNumbers.indexOf(Collections.max(selectionNumbers)));
			result = p.canBuild(leftNeighbor, rightNeighbor);
			switch ( result )
			{
			case 0: 
				selectionNumbers.remove(Collections.max(selectionNumbers));
				continue;
			
			case 1: 
				p.buildStructure();
				did = true;
				break;
			case 2:
				did = true;
				p.buildStructure(leftNeighbor, rightNeighbor, 2);
				break;
			}
			if ( result != 0 ) break;
		}
		if ( !did )
		{
			p.chooseCard(Collections.max(p.blockSelectionNumbers(leftNeighbor, rightNeighbor)));
			int result = p.canBuildStage(leftNeighbor, rightNeighbor);
			switch ( result )
			{
			case 0: break;
			
			case 1: 
				did = true;
				p.buildStage(leftNeighbor, rightNeighbor, 2);
				break;
				
			case 2:
				did = true;
				p.buildStage(leftNeighbor, rightNeighbor, 2);
				break;
			}
		}
		if ( !did )
		{
			p.getOwnedResources().addCoins(3);
		}
		p.cards.remove(p.chosenCardIndex);
	}
}
