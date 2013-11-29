import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class MainWindowListener extends WindowAdapter
{
	public void windClosing (WindowEvent e)
	{
		System.exit(0);
	}
}