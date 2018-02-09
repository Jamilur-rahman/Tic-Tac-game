	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.swing.border.LineBorder;
	
public class Cell extends JPanel{
	
	private char token = ' ';
	
	public Cell(){
		
		setBorder(new LineBorder(Color.black, 1));
	}

}
