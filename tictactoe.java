import javax.swing.*;
import java.awt.*;
	
public class tictactoe extends JFrame{
	JPanel p= new JPanel();
	XOButton[]  Buttons= new XOButton[9];
	public static void main(String args[]){
		new tictactoe();
	}
	public tictactoe(){
	
		super("tictactoe");
		setSize(640,480);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++){
			Buttons[i]=new XOButton();
			p.add(Buttons[i]);
		}
		add(p);
		setVisible(true);
		
	}


}