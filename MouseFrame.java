import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

class MouseFrame extends JFrame
{
	public JLabel info;
	public MouseFrame()
	{
		setTitle("Uso de Eventos");
		setSize(600,400);
		addWindowListener(new MainWindowListener());
		info=new JLabel("Mueva el Mouse");
		Container contenido= getContentPane();
		contenido.add(info.BorderLayout.SOUTH);
		
		this.addMouseListener(new MiMouseAdapter(this));
		this.addMouseMotionListener(new MiMouseMotionAdapter(this));	
	}
}