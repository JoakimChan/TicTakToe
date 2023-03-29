
public class Board {
	private int _size;
	private char[][] box;
	

	public Board(int size) {
		box = new char[size][size];
		_size = size;
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				box[i][j] = ' ';			
	}
	
	public char getCharacter(int r, int c) {
		return box[r][c];
	}
	
	public boolean checkPlace(int r, int c) {
		if(box[r][c] == ' ')
			return true;
		else
			return false;
	}
	public void setBox (int r, int c, char player) {
		box[r][c] = player;
	}
	public int returnSize() {
		return _size;
	}
}
