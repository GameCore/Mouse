import java.lang.Object;
import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
import java.awt.Toolkit;

abstract class ButtonPanel extends Jpanel implements ActionListener

{
	private JButton redbutton;
	private JButton bluebutton;
	private JButton greenbutton;
	
	public ButtonPanel()
	{
		redbutton=new JButton("}Rojo");
		bluebutton=new JButton("Azul");
		greenbutton=new JButton("Verde");
		this.add(redbutton);
		this.add(bluebutton);
		this.add(greenbutton);
		
		redbutton.addActionListener (this);
		bluebutton.addActionListener (this);
		greenbutton.addActionListener (this);
	}
	
	public void actionPermfomed (ActionEvent event)
	{
		Object source=event.getSource();
		Color color=getBackground();
		if (source==redbutton)
		color=Color.RED;
		else if (source==bluebutton)
		color=Color.BLUE;
		else if (source==greenbutton)
		color=Color.GREEN;
		setBackground (color);
		Repaint();
	}
	
}
