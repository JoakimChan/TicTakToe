
public class Rules {
	private static Board board;
	
	public Rules(Board _board) {
		board = _board;
	}
		
	public boolean whoWon(){
		for(int c = 0; c < board.returnSize(); c++) {
			for(int r = 0; r < board.returnSize(); r++) {
				int counterRow = 0;
				int counterCol = 0;
				int counterDiag = 0;
				int counterDiagR = 0;
				char character = board.getCharacter(r, c);
				//row
				if(character != ' ' && r+2 < board.returnSize()) {
					for(int i = 0; i < 3; i++) 
						if(character == board.getCharacter(r+i, c))
							counterRow++;
				}
				//col
				if(character != ' ' && c+2 < board.returnSize()) {
					for(int i = 0; i < 3; i++) 
						if(character == board.getCharacter(r, c+i))
							counterCol++;
				}
				//diag
				if(character != ' ' && r+2 < board.returnSize() && c+2 < board.returnSize()) {
					for(int i = 0; i < 3; i++) 
					if(character == board.getCharacter(r+i, c+i))
						counterDiag++;
				}
				//diagR
				if(character != ' ' && c+2 < board.returnSize() && r-2 > -1) {
					for(int i = 0; i < 3; i++)
						if(character == board.getCharacter(r-i, c+i))
							counterDiagR++;
					}
			if(counterRow == 3 || counterCol == 3 || counterDiag == 3 || counterDiagR == 3)
				return true;
				}
			}
		return false;
		}
}

