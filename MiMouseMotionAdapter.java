import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

class MiMouseMotionAdapter extends MouseMotionAdapter
{
	private MouseFrame frame;
	public MiMouseMotionAdapter(MouseFrame frame)
	{
		this.frame=frame;
	}
	public void mouseMovered(MouseEvent e)
	{
		frame.info.setText("Raton en ("+ev.getX()+","+ev.getY()+")");
	}
}