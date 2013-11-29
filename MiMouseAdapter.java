import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

class MiMouseAdapter extends MouseAdapter

{
	private MouseFrame frame;
	public MiMouseAdapter(MouseFrame frame)
	{
		this.frame=frame;
	}
	
	public void mouseClicked (MouseEvent event)
	{
		frame.info.setText("Raton pulsado en ("+event.getX()+","+event.getY()+")");
	}
	
	public void mouseEntered(MouseEvent event)
	{
		frame.info.setText("El ratón entro a la Ventana");
	}
		
}