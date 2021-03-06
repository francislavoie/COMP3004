package WonderBoards.Boards;

import Structures.Structure;
import Structures.Effects.ResourcesBonus;
import Structures.Effects.VictoryPointBonus;
import Tokens.Resources;
import WonderBoards.WonderBoard;
import WonderBoards.WonderBoardStage;

public class ThePyramidsOfGiza extends WonderBoard {

	
	public ThePyramidsOfGiza()
	{
		super(7, 1);
		WonderBoardStage stage1 = new WonderBoardStage(new Resources(0, 2, 0, 0, 0, 0, 0, 0));
		WonderBoardStage stage2 = new WonderBoardStage(new Resources(0, 0, 3, 0, 0, 0, 0, 0));
		WonderBoardStage stage3 = new WonderBoardStage(new Resources(0, 4, 0, 0, 0, 0, 0, 0));
		@SuppressWarnings("unused")
		WonderBoardStage stage4 = null;
		stages.add(stage1);
		stages.add(stage2);
		stages.add(stage3);
		
		startResource = new ResourcesBonus(0, 1, 0, 0, 0, 0, 0);
	}
	
	public ThePyramidsOfGiza(int side)
	{
		super(7, side);
		WonderBoardStage stage1 = new WonderBoardStage((side == SIDE_A ? new Resources(0, 2, 0, 0, 0, 0, 0, 0) : new Resources(0, 0, 2, 0, 0, 0, 0, 0)));
		WonderBoardStage stage2 = new WonderBoardStage((side == SIDE_A ? new Resources(0, 0, 3, 0, 0, 0, 0, 0) : new Resources(0, 3, 0, 0, 0, 0, 0, 0)));
		WonderBoardStage stage3 = new WonderBoardStage((side == SIDE_A ? new Resources(0, 4, 0, 0, 0, 0, 0, 0) : new Resources(0, 0, 0, 3, 0, 0, 0, 0)));
		WonderBoardStage stage4;
		
		startResource = new ResourcesBonus(0, 1, 0, 0, 0, 0, 0);
		
		if ( side == SIDE_A )
		{
			stage1.getEffects().add(new VictoryPointBonus(3));
			stage2.getEffects().add(new VictoryPointBonus(5));
			stage3.getEffects().add(new VictoryPointBonus(7));
		}
		else
		{
			stage1.getEffects().add(new VictoryPointBonus(3));
			stage2.getEffects().add(new VictoryPointBonus(5));
			stage3.getEffects().add(new VictoryPointBonus(5));
		}
		
		
		stages.add(stage1);
		stages.add(stage2);
		stages.add(stage3);
		if ( side == SIDE_B ) 
		{
			stage4 = new WonderBoardStage(new Resources(0, 4, 0, 0, 0, 0, 1, 0));
			stage4.getEffects().add(new VictoryPointBonus(7));
			stages.add(stage4);
		}
	}
	
	public boolean isBuilt()
	{
		if ( side == SIDE_A )
			return (stages.get(1).isBuilt() & stages.get(2).isBuilt() & stages.get(3).isBuilt());
		return (stages.get(1).isBuilt() & stages.get(2).isBuilt() & stages.get(3).isBuilt() & stages.get(4).isBuilt());
	}
	
	public boolean buildStage(Structure card, Resources funds)
	{
		for (WonderBoardStage s : stages)
		{
			if (!s.isBuilt())
			{
				return s.build(card, funds);
			}
		}
		return false;
	}
	


}
