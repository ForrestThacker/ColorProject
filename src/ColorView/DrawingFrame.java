package ColorView;

import javax.swing.*;

/**
 * 
 * @author ftha4681
 *@version 0.x 4/25/16
 */

public class DrawingFrame extends JFrame
{
	private DrawingPanel basePanel;
	private DrawingController baseController;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		basePanel;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Drawing stuff in Java");
		this.setVisible(true);
	}
}
