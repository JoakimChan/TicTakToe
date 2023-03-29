
public class Controller {
	private static int rowCol = 5;
	private static Board board = new Board(rowCol);
	private static Rules rules = new Rules(board);
	private static Player player = new Player();
	private char play;
	static View view = new View();
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		view.Bord(rowCol,rowCol,controller);
	}
	public void unitClicked(int r,int c) {
		play = player.getWhoseTurn();		
		if (board.checkPlace(r,c) == true) {
			board.setBox(r, c, play);
			view.setButton(play,r,c);
		if (rules.whoWon() == true) {
			view.setWinner(play + " won!");
		}	else {
			player.switchPlayer(play);
			play = player.getWhoseTurn();
			view.setTurn(play);		
			}
		} 
	}
}