package WonderBoards;

public class WonderBoard {

	protected static final int NO_BOARD = 0;
	
	public static final String BOARD0 = "Invalid";
	public static final String BOARD1 = "The Colossus of Rhodes";
	public static final String BOARD2 = "The Lighthouse of Alexandria";
	public static final String BOARD3 = "The Temple of Artemis in Ephesus";
	public static final String BOARD4 = "The Hanging Gardens of Babylon";
	public static final String BOARD5 = "The Statue of Zeus in Olympia";
	public static final String BOARD6 = "The Mausoleum of Halicarnassus";
	public static final String BOARD7 = "The Pyramids of Giza";
	
	protected static final int SIDE_A = 1;
	protected static final int SIDE_B = 2;

	protected int BoardID;
	protected int Side;
	protected String BoardName;
	
	//Constructors
	public WonderBoard()
	{
		BoardID = NO_BOARD;
		Side = NO_BOARD;
		BoardName = BOARD0;
	}
	
	public WonderBoard(int boardID, int side)
	{
		BoardID = boardID;
		Side = side;
		SetBoardName(boardID);
	}
	
	//getters
	public int GetBoardID()
	{
		return BoardID;
	}
	
	public int GetSide()
	{
		return Side;
	}
	
	public String GetBoardName()
	{
		return BoardName;
	}
	
	//setters
	public void SetBoardID(int id)
	{
		BoardID = id;
		SetBoardName(id);
	}
	
	public void SetSide(int side)
	{
		Side = side;
	}
	
	private void SetBoardName(int boardID)
	{
		switch ( boardID )
		{
			case 1:
				BoardName = BOARD1;
				break;
			case 2:
				BoardName = BOARD2;
				break;
			case 3:
				BoardName = BOARD3;
				break;
			case 4:
				BoardName = BOARD4;
				break;
			case 5:
				BoardName = BOARD5;
				break;
			case 6:
				BoardName = BOARD6;
				break;
			case 7:
				BoardName = BOARD7;
				break;
			default: BoardName = BOARD0;
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
