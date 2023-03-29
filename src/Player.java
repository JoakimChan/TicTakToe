
public class Player {
private char whoseTurn = 'X';
	
	public char getWhoseTurn() {
		return whoseTurn;
	}
	
	public void setPlayer(char player) {
		whoseTurn = player;
	}
	
	public void switchPlayer(char player) {
		switch(player) {
		case 'X':
			setPlayer('O');
			break;
		case 'O':
			setPlayer('P');
			break;
		case 'P':
			setPlayer('X');
		}		
	}
}
