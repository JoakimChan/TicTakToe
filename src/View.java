import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

public class View {
		private boolean gameover = false;
		JLabel status = new JLabel("X's turn to play");
		JButton buttons[][];
		
	public void Bord(int row, int col,Controller controller) {
		buttons = new JButton[row][col];
		JFrame frame = new JFrame("TicTacToe");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel myButtonPanel = new JPanel ();
	    myButtonPanel.setLayout(new GridLayout(row, col));
	    
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				final int _r = r;
				final int _c = c;
				JButton button = buttons[r][c]= new JButton();
				button.setPreferredSize(new Dimension(50, 50));
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					if(!gameover)
						controller.unitClicked(_r, _c);
				}
			});
			myButtonPanel.add(button);
			}
		}
	JPanel myTextPanel = new JPanel();
    myTextPanel.setLayout(new GridLayout(1,1));
    myTextPanel.setPreferredSize(new Dimension(150,50));
	myTextPanel.add(status);

	JPanel myMainPanel = new JPanel();
    myMainPanel.setLayout(new BoxLayout(myMainPanel, BoxLayout.Y_AXIS));
    myMainPanel.add(myButtonPanel);
    myMainPanel.add(myTextPanel);
   
    frame.getContentPane().add(myMainPanel);

    //Display the window.
    frame.pack();
    frame.setVisible(true);
	}
	
	public void setWinner(String s) {
		gameover = true;
		status.setText(s);
	}
	public void setTurn(char a) {
		String s = Character.toString(a); 
		status.setText(s + "'s turn to play");
	}
	public void setButton(char play,int r ,int c) {
		switch(play) {
		case 'X':
			buttons[r][c].setText("X");
			break;
		case 'O':
			buttons[r][c].setText("O");
			break;
		case 'P' :
			buttons[r][c].setText("P");
			break;
		}
	}
}